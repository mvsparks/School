#!/usr/bin/python
# a simple class/object demo

# construct a bank account object
# include a few useful methods.
# Note: "self" is a self-ref
# similar to "this" in java
class BankAccount(object):
  def __init__(self):
      self.balance = 0
  def deposit(self,amount):
      self.balance += amount
  def withdraw(self, amount):
      self.balance -= amount
  def get_balance(self):
      return self.balance

mymoney = BankAccount()  # creates a new account
dep = input('How much would you like to deposit into this account? ')
mymoney.deposit(dep)
print 'Balance after deposit: ', mymoney.get_balance()

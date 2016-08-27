#!/usr/bin/python
# function demo 2: globals

def test_function():
  global var
  print 'in test_function\n'
  var = 999999999

def test2():
  var = -100


# "main"
var = 0
print 'starting program, about to call test_function\n'
test_function()
test2()
print 'after function call, var: ', var

#!/usr/bin/python
# function demo 1

def test_function(arg):
  print 'in test_function\n'
  arg = arg + 22
  # uncomment the line below to test scoping rules
  var = 999999999
  return arg

# "main"
var = 0
print 'starting program, about to call test_function\n'
test_function(var)
print 'after function call, var: ', var

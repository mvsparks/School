#!/usr/bin/python

# equality vs equivalence

lst1 = [1, 7, 3, 9, 2]
lst2 = lst1 # two refs to same location in memory
new_list = lst1[:] # same content as lst1, new memory (different location)

#lst2[0]=999999999

print '\n'
if new_list == lst1:
  print 'new_list has same content as lst1'
else:
  print 'new_list does not have same content as lst1'
if new_list is lst1:
  print 'new_list and lst1 refer to same object'
else: 
  print 'new_list and lst1 do not refer to same object'

print '\n'

if lst2 == lst1:
  print 'lst2 has same content as lst1'
else:
  print 'lst2 does not have same content as lst1'
if lst2 is lst1:
  print 'lst2 and lst1 refer to same object'
else:
  print 'lst2 and lst1 do not refer to same object'


print '\n'

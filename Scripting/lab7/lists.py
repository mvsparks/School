#!/usr/bin/python

# demo script for list functions

lst = [1, 7, 3, 9, 2]
print 'Starting list', lst
lst.append(4)

print 'After appending: ', lst

lst.extend([8,5])
print 'After extending: ', lst

print 'The number of 8s is: ', lst.count(8)

print 'The index of the first occurrence of the number 8 is: ', lst.index(8)

x = lst.pop()
print 'After applying the pop() function, list contains: ', lst
print 'x is: ', x

lst.sort()
print 'Sorted list(ascending order): ', lst
lst.reverse()
print '...and in descending order: ', lst

# can we use append in place of extend?
# add some code below to find out:

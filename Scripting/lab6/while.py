#!/usr/bin/python
# Demo of a for loop

cash = 1000
rate = 0.02
year = 1
while year<=10:
  cash = cash + cash*rate
  print year, ' year(s) after initial investment, '
  print 'the total will be: ', cash, '\n\n'
  year = year + 1

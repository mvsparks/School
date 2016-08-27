#!/usr/bin/python
# Demo of nested conditionals:
# initially, incorrect allignment is used.

highest = 0.97
percent = 0.98

if percent >= 0.9:
  print 'You got an A.'
  if percent >= highest:
  print 'Yours was the highest grade on this lab.'

print 'One more print line: printed at the end.'

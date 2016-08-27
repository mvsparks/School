#!/usr/bin/python

# determines word frequencies in user input. 
# type 'quit' to exit program

freq = {}
line = raw_input()
while line != 'quit':
  words = line.split()
  for word in words:
    freq[word] = freq.get(word, 0) + 1
  line = raw_input()

# when 'quit' detected:
for word in freq:
  print word, ': ', freq[word]

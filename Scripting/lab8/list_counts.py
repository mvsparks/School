#!/usr/bin/python

# determines word frequencies in user input. 
# type 'quit' to exit program

freq = []
term_list = []
line = raw_input()
while line != 'quit':
  words = line.split()
  for word in words:
    if word not in term_list:
      term_list.append(word)
      freq.append(1)
    else:
      i = term_list.index(word)
      freq[i] += 1
  line = raw_input()

# when 'quit' detected:
i = 0
for word in term_list:
  print word, ': ', freq[i]
  i += 1

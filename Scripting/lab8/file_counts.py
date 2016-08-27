#!/usr/bin/python
from sys import argv

# determines word frequencies in a given text file
# usage: ./file_counts.py input_filename

def count(file):
  freq = {}
  lines = file.readlines()
  for line in lines:
    words = line.split()
    for word in words:
      freq[word] = freq.get(word, 0) + 1
  return freq

#main
file = open(argv[1])
freq = count(file)
for word in freq:
  print word, ': ', freq[word]
file.close()

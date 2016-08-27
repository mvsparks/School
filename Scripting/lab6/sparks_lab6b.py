#!/usr/bin/python

word = raw_input('Enter a word: ')
print "Letters: ",len(word)

word=word.lower()

sum=word.count('a')
sum+=word.count('e')
sum+=word.count('i')
sum+=word.count('o')
sum+=word.count('u')

print "Vowels: ",sum

print "Percentage of vowels: ", float(sum)/len(word)*100

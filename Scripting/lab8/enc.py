#!/usr/bin/python
from sys import argv

letters = 'a b c d e f g h i j k l m n o p q r s t u v w x y z'
chars = '~ ` ! @ # $ % ^ & * _ - + = ] } [ { \\ ? / . > < ; |'
letters = letters.split()
chars = chars.split()

def replace(file,key,letters):
  line = ''
  for word in file:
    line = line + word
    for x in line:
      for y in letters:
        if x == y:
          line = line.replace(x,key[x])
  return line

def write(file,input):
  encryptFile = open(file, 'w')
  encryptFile.write(input)
  encryptFile.close()
  

key = {'a':'`','b':'~','c':'!','d':'@','e':'#','f':'$','g':'%','h':'^','i':'&','j':'*','k':';','l':'_','m':'<','n':'.','o':'>','p':'?','q':'/','r':']','s':'[','t':'{','u':'}','v':'\\','w':'|','x':'=','y':'+','z':'-'}

try:
  
  file = open(argv[1])
  input = replace(file,key,letters)
  file.close()
  file = 'encrypted_' + argv[1]
  write(file, input)

#  Testing
#  key = dict(zip(key.values(),key.keys()))
#  fileNew = open(file)
#  input = replace(fileNew,key,chars)
#  fileNew.close()
#  file = 'encrypted_' + file
#  write(file,input)

except IndexError as e:
  print "Usage: ./enc.py [filename]"


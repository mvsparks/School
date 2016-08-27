#!/usr/bin/python
a = 0
b = 0
c = 0

for a in range(1,21):
    a += 1
    for b in range(1,21):
        b += 1
        for c in range(1,21):
            c += 1
            if a*a+b*b == c*c:
                if a < b:
                    print(a,b,c)
 

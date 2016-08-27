#!/usr/bin/python
import random

die1=random.randint(1,6)
die2=random.randint(1,6)

sum = die1+die2

if (sum==7 or sum==11):
    print "You rolled a",sum,"You are a winner!"
else:
    if(sum==1 or sum==3 or sum==12):
        print "Craps. You rolled a",sum,"You lose. Please try again."
    else:
        point=sum
        sum=0
        print "Point:", point
        while sum!=point:
            die1=random.randint(1,6)
            die2=random.randint(1,6)
            sum=die1+die2
            if sum==point:
                print "You rolled a",sum,"You are a winner!"
            elif sum==7:
                print "You rolled a",sum,"You lose. Please try again."
                sum=point
            else:
                print "You rolled a",sum,"Please roll again."

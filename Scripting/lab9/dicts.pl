#!/usr/bin/perl

# dictionaries in perl example

# quick but not very readable setup:
%dogs=("black","labrador","red","setter","white","poodle");

# the => provides a way to pair up keys and values so that
# the code is more readable
#%dogs=(black => "labrador", # no need to use quotes for keys
#       red => "setter",     # when using the => notation
#       white => "poodle");

$dogs{"various"} = "mutt";
#$dogs{various} = "mutt";  # quotes for keys still optional 
$my_dog = $dogs{red};   # $my_dog = "setter"

# the following variable interpolation produces the string
# "my dog is a mutt" 
print "my dog is a $dogs{various}\n";  

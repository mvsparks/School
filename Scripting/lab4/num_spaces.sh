#!/bin/sh

# demonstrates how sed can be used to 
# insert a space between every pair of digits,
# at the same time, removes any extra spaces
# (two consecutive spaces get turned into one)

# Note:  "simple.txt" is hardcoded, but you can 
# easily change the script to work with any
# user-provided file (using command-line args)

echo "Without removing extra spaces:"
sed -rn 's/([0-9])/\1 /gp' simple.txt

echo "Removing extra spaces..."
echo "First way:"
sed -rn 's/([0-9])/\1 /gp' simple.txt | sed -r 's/  / /g'
echo "Second way:"
sed -rn 's/([0-9])/\1 /gp' simple.txt | sed -r 's/[ ]{2}/ /g'

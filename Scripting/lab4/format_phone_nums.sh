#!/bin/sh
# Script finds phone numbers in either 
# (ddd)ddd-dddd or ddd-ddd-dddd form
# and prints them out as dddddddddd.

# Usage: ./format_phone_nums input_fname

# -r causes sed to use extended regular expressions
# parenthetical expressions are numbered as follows:
#               1         2         3          4
sed -r 's;\(?([0-9]{3})(\)?|-?)([0-9]{3})-([0-9]{4});\1\3\4;' $1 | egrep -o '[0-9]{10}'

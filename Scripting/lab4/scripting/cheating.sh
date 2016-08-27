#!/bin/sh
# script for cheating at word puzzles
# Usage:
# cheating.sh egrep-pattern
# Example pattern: '^b[^-]...x...$'

if [ -z $1 ];then
echo "Usage: ./cheating 'pattern'"
else
# -i ignores case
egrep -i "$1" /usr/share/dict/words
fi

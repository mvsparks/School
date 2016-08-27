#!/bin/sh

#loop through a list (red blue green is a list)
for color in red blue green
do
  echo "Color is $color"
done

#loop through every file in current dir
for fname in *
do
  echo "file: $fname"
done

#command line args
count=1
for arg in $@
do
  echo "Arg$count: $arg"
  count=$((count=count+1))
done

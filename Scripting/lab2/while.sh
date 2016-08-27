#!/bin/sh

count=1
while [ $count -le 4 ]
do
  echo $count
  count=$((count + 1))
done

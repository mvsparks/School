#!/bin/sh
echo Menu
echo 1.Short format display
echo 2.Long format display
echo 3.Include hidden files
echo Enter your choice:
read ch

# note that there is some flexibility as far as spacing in case statements goes
case $ch in
1)ls;;
2) ls -l ;;
3) ls -la;;
*)  echo Choice is not correct;;
esac

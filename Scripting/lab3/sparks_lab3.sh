#!/bin/sh

if [ $1 = "-e" ] ; then
	egrep -o '[a-zA-Z0-9._-]+@{1}[a-zA-Z0-9._-]+\.[a-zA-z]{3,4}\>' $2

elif [ $1 = "-p" ] ; then
	egrep -o '\(*[0-9]{3}\)*\-*[0-9]{3}\-[0-9]{4}' $2
else
	echo "Incorrect argument"
	echo "Usage: ./sparks_lab3.sh [-e | -p] [Filename]"
fi



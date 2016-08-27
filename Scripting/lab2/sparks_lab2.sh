#!/bin/sh

count=0
total=0
approx=0

for isFile in *
do

	if [ -f $isFile ] ; then #checking if there is a file

		let "total=$total + $(wc -c <$isFile)" #using < prints out
						       #bytes only without
						       #filename
	fi

done
approx=$((total/1000))
echo "Total size of all files in this directory: $total bytes (~$approx KB)"

for isFile in *
do 

	if [ -r $isFile ] ; then
		
		let "count=$count + 1"
	fi
done
echo "$count of the files have read permissions."

count=0
for isFile in *
do 

	if [ -w $isFile ] ; then
	
		let "count=$count + 1"
	fi
done
echo "$count of the files have write permissions."

count=0
for isFile in *
do
	if [ -x $isFile ] ; then

		let "count=$count + 1"
	fi
done
echo "$count of the files have excecute permissions."

echo "Estimated number of shell script files in this directory:"
grep "#\!/bin/sh" * | wc -l #grep will print out all files with string
  		            #using wc -l will count the number of lines
		            #grep displays which is each individual file
                            #files that are considered shell script files
			    #start with /bin/sh

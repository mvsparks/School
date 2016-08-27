#!/bin/sh
#lab4 by Vince Sparks
#Using sed to replace characters and create html file from a formatted input file

echo \<HTML\>
echo \<HEAD\>\<TITLE\>Lab4 HTML file by Vince Sparks\<\/TITLE\>\<\/HEAD\>
echo \<BODY\>
echo \<TABLE BORDER=\"1\"\>

sed -r 's;(\,\ )+;\ ;g' input.csv | #Taking out all commas inside quotation lines
	sed -r 's;[a-zA-Z0-9\#\:\.@\&\/\ \"-]+;<TD>&</TD>;g' | #Insert tags around all words surrounded by quotes and ignoring commas
		sed -r 's;[a-zA-Z0-9\#\:\.@\&\/\ \<\>\"\,-]+;<TR>&</TR>;g' | #Inserting tags at the start and end of each line
			sed -r 's;[a-zA-Z0-9\#\:\.@\&\/\ \<\>\"\,-]+(TN)[a-zA-Z0-9\#\:\.@\&\/\ \<\>\"\,-]+;<TR bgcolor="#FF9900">&;g' | # putting background tag at the front of line when there is a TN address
				sed -r 's;[\,\"];;g' |  #Taking out quotes and remaining commas
					sed 's;<TR bgcolor=#FF9900><TR>;<TR bgcolor=#FF9900>;g' #Fixing background tag at the starting of tn lines
echo \<\/TABLE\>
echo \<\/BODY\>
echo \<\/HTML\>

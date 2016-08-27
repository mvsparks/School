#!/usr/bin/perl

$numArg = $#ARGV + 1;
print "Number of arguements: $numArg\n";
print "Arguements: $#ARGV\n";
	foreach $num (0 .. $#ARGV){
	#	print "$ARGV[$num]\n";
		@arr[$num] = $ARGV[$num];
		print "arr: @arr[$num]\n";
	}
	print "last: $ARGV[-1]\n";
	

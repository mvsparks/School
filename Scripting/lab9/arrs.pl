#!/usr/bin/perl

# a few array command examples

# setup vs access/modification:
@dogs = ("collie", "hound", "mutt");
print "\nFirst value in array: $dogs[0]\n";

# alternative setup:
#$xvals[0] = 1;
#$xvals[1] = 2;
#print "alternative setup example, xvals: @xvals\n";

#@dir = `ls`;    # an array of the filenames in the current directory 
#print "\nall values returned by ls:\n @dir";
#print "\nfirst  value in array: $dir[0]\n";

# a few different ways to "unpack" an array:
#@nums = (2,4,6,9);
#($a,$b,$c) = @nums;  # $a=2 $b=4 $c=6
#($x,@fewer) = @nums; # $x=2 @fewer=(4,6,9)
#($t1,$t2,$t3,$t4) = @fewer # $t1=4 $t2=6 $t3=9 $t4 is undef

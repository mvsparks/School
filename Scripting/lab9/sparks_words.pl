#!/usr/bin/perl


$line = "";
foreach $string (<STDIN>){
	$line = $line.$string; #concadinating line with next word from stdin
	}
	$line =~ s/(\W)+/ /gs; #replacing non alphanumeric with space 
	@stringArray = split(/[ \n]/,lc $line); #spliting string up by spaces
						#and newlines and putting into array
	$len = scalar @stringArray; #getting length of array
foreach $x(0 .. $#ARGV){
	@count[$x] = 0; #filling count array with zeros so
			#words that are not in file will show 
			#zero instead of nothing
}
foreach $num (0 .. $#ARGV){
	@arr[$num] = $ARGV[$num]; #putting words given in command line
				  #into an array
	foreach $i (0 .. $len){
		if(@arr[$num] eq @stringArray[$i]){ #use eq when comparing strings
			@count[$num] = @count[$num] + 1;
		}		
	}
}
#creating dictionary with two arrays
my %dict;
@dict{@arr} = @count;
foreach (reverse sort { ($dict{$a} cmp $dict{$b}) || 
		($b cmp $a)} keys %dict){ #using reverse sort to get higher numbers first
					  #first part of sort ($dict{$a} cmp $dict{$b}) sorts numbers
					  #first part is piped into second sort ($b cmp $a) which sorts alphabetically
	print "$_: $dict{$_}\n";   

}

#testing command line arguements
#$numArg = $#ARGV + 1;
#print "Number of arguements: $numArg\n";
#print "Arguements: $#ARGV\n";
#		print "arr: @arr[$num]\n";
#	}
#	print "last: $ARGV[-1]\n";
	

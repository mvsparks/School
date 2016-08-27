#!/usr/bin/perl

print "Please enter your credit card number: ";
$creditCard = <>;
	if($creditCard =~ /[0-9]{4}[\ \-]?/gs){ # checking if credit card matches (~=) 
						#/[a group of four numbers][followed by maybe a space or dash]?
						#(zero or 1 occurances)/g(save spot)s(matches subpatterns)
		chomp($creditCard); #taking out newline at end of string		
		@credit = split(/[\-\ ]/,$creditCard); #taking out any spaces or dashes 
		$creditCard = join("",@credit);
		$len = length $creditCard; 
		if($len == 16){
			$creditCard =~ s/(.{1,4})/$1\n/gs; #search and replaces group of 4 numbers with same group of numbers
						           #plus a newline
			print "$creditCard";
		}
	
		else{
			print "Invalid Credit Card Number: $creditCard\n";
		}
	}
	else{
		print "Invalid Credit Card Number: $creditCard";	
	}

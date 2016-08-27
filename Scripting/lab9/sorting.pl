#!/usr/bin/perl

# a little dictionary sorting demo
# first is primary sort, next secondary sort
#

%words = (
    will  => 1,
    smith => 3,
    zero  => 2,
    swim  => 2,
    the   => 2,
    aardvark  => 1
);

foreach (reverse sort { ($words{$a} cmp $words{$b}) || ($b cmp $a) } keys %words) 
{
    print "$_: $words{$_}\n";
}

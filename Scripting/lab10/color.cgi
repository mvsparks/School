#!/usr/bin/perl
use CGI ':standard';
$form = new CGI;
print $form->header;
$form->start_html('Test page');
$color = $form->param('colors');
@vehicle = $form->param('vehicle');
if(scalar @vehicle < 1)
{
  print "Input not selected - please go back and check at least one checkbox";
}

foreach $i (@vehicle)
{
  print "<font color=\"$color\">";
  print "$color $i";
  print "s are great!";
  print "</font>";
  print "<br>\n";
}
$form->end_html();
exit 0;

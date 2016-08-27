#!/usr/bin/perl
use CGI ':standard';
$form = new CGI;
print $form->header;
$form->start_html('Test Page - CGI made this');
$color=$form->param('colors');
print "<font color=\"$color\">";
print "Your favorite color is: $color";
print "</font>";
$form->end_html();
exit 0;

#!/bin/sh

# Not all commands will work at the prompt. Some are "script-only",
# one example of such a command is "read -p" below. This command
# is used to display a prompt, then get input from the user.

# when a variable is getting input, no $ preceeds the name:
read -p "Enter Major Code: " major

# but when the variable is being accessed, the name needs to start
# with $
if [ $major = CSIT ] ;then
  echo $major "stands for Computer Science and Information Technology"
elif [ "$major" = "OST" ]; then
  echo $major "stands for Office Systems Technology"
elif [ $major = GIS ] ; then
  echo $major" stands for Geographic Information Systems"
else
  echo "Unknown Major"
fi 

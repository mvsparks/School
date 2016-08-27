#!/bin/sh

echo "Username: $USER"
echo "Computer name: $HOSTNAME"

# There is an error below. It might be 
# hard to see, but try running the script
# (the error message in this case is very
# helpful)

if [ -e /etc/hosts ]; then
  echo "/etc/hosts file exists on this system"
else
  echo "/etc/hosts doesn't exist on this system"
fi

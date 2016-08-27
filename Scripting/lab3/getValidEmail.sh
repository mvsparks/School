#!/bin/sh

# Extracts entire lines containing valid
# email addresses. What change(s) would
# you need to make to get just the addresses?
#
# Usage: ./getValidEmail input_file_name

echo "Method 1: (.com, .edu, .org, .net)"

# version 1: assumes that the only valid domain types are .com, .edu, .org, and .net
egrep '[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\.(com|edu|org|net)\>' $1

# the pattern above will match:
# one or more alpha-numerics (also including characters: . and -),
# followed by @, followed by one or more
# alpha-numerics, followed by ., ending on com or edu or org or net.

echo "------------------"
echo "Method 2: (any 3-letter domain type)"

# version 2: assumes that any three-letter code is a valid domain type
egrep '[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\.[a-z]{3}\>' $1

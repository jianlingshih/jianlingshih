#!/bin/bash
a=1
b=1
echo -n -e "$a\t$b"
let "n=a+b"
count=2
while  [ $count -le 28 ]
do
	let "a=a+b"
	let "b=b+a"
echo -n -e "\t$a\t$b"
let "n+=a+b"
let "count=count+2"
done
echo
echo "The sum is $n"
#end

#!/bin/bash
echo "请输入a b 两个数"
read a b
let "c=a*a+b*b"
let "d=c%5"
echo $c
echo $d
if [ "$d" -eq 0 ]
	then echo "a,b的平方和能被5整除"
else echo "a,b平方的和不能被5整除"

fi

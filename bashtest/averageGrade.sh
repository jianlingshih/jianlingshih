#!/bin/bash
i=0
declare A
while [ $i -lt 5 ]
do
echo "pls input one student's grade"
read a
A[i]=$a
let "sum=sum+A[i]"
let "i=i+1"
done
let "g=sum/5"
echo "average grade is"
echo $g

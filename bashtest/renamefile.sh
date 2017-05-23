#!/bin/bash
mkdir txt
for((i=1;i<10;i++))
do 
touch txt/2017-0$i.txt
done
touch txt/2017-10.txt
cd txt
for((i=1;i<10;i++))
do
mv 2017-0$i.txt 0$i.txt
done
mv 2017-10.txt 10.txt

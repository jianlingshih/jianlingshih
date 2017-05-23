#!/bin/bash
read grade
let "gradef=grade/10"
case $gradef in
8 | 9 | 10) echo "优秀";;
7) echo "良好";;
6) echo "中等";;
0 | 1 | 2 | 3 | 4 | 5) echo "不及格";;
*) echo "Sorry, answer not recognized";;
esac
#end

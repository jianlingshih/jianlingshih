#!/bin/sh
IP='116.14.181.47'
USER='hello'
PASS='hello'
DB_NAME='test'

Sql="update testuser set age=29 where name='xia'"
#########################
mysql -h${IP} -P3306 -u${USER} -p${PASS} ${DB_NAME} -e"${Sql}"
echo " ============GQY=============="
echo "update GQY sign!"
#########################

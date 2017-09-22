#!/usr/bin/env bash

mvn clean
mvn package
#cp target/bidsList.war /var/lib/tomcat-8.5/webapps/bidsList.war #gentoo
cp target/bidsList.war /var/lib/tomcat8/webapps/bidsList.war #debian
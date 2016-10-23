#!/bin/sh
# muquit@muquit.com Oct-23-2016 
#javadoc -d ~/x -stylesheetfile ~/Downloads/java/javadoc_css/stylesheet.css  $(find . -name *.java)
/bin/rm -rf ./docs/*
javadoc -d ./docs  $(find . -name *.java)


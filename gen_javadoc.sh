#!/bin/sh
# muquit@muquit.com Oct-23-2016 
#javadoc -d ~/x -stylesheetfile ~/Downloads/java/javadoc_css/stylesheet.css  $(find . -name *.java)
/bin/rm -rf ./target/docs/*
javadoc -d ./target/docs  $(find . -name *.java)
cp -av ./target/docs/* ../gh-pages/javadoc-test/


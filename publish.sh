#!/bin/sh

# muquit@muquit.com Oct-23-2016 
RM="/bin/rm -rf"
CP="/bin/cp -a"
git co gh-pages
${RM} ./docs/*
${CP} ./docs/* docs/
git add docs
git commit -am'generated javadocs'
git co master 
git push origin master
git push origin gh-pages

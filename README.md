# javadoc-test
Testing pushing javadoc to gh-pages

# How to generate javadocs and host them on github gh-pages branch

Before I forget, here is how to generate javadocs for a project and publish to github gh-pages branch and the 
documents can be accessed as HTML.

* Create the project repository on github and checkin the project in master branch then go
up one directory from the project directory

~~~
$ pwd
/Users/muquit/gitdev/JavadocTest
$ cd ..
~~~

* Make a directory ```gh-pages``` and clone the project and create ```gh-pages``` branch

~~~
$ mkdir gh-pages
$ cd gh-pages
$ git clone git@github.com:muquit/javadoc-test.git
$ cd javadoc-test
$ git branch
~~~

* Create and checkout the ```gh-pages``` branch

~~~
$ git checkout --orphan gh-pages
~~~

* Remove all the files as this branch will only hold the javadocs files.

~~~
$ git rm -rf pom.xml gen_javadoc.sh README.md publish src/
$ git commit -am'deleted everything'
$ git status
On branch gh-pages
nothing to commit, working directory clean
$ git branch
* gh-pages
  master
~~~

* Now go back to the master branch of the real project and generate javadoc
and copy them to the ```gh-pages``` branch. I use a simple script to do that.

~~~
$ cd ../../JavaDocTest
$ ./gen_javadoc.sh
~~~

* Come back to gh-pages branch and commit the files

~~~
cd ../gh-pages/javadoc-test
git status
git add .
git commit -am'add javadocs'
git push origin pages
~~~

* Browse the javadocs at: 
[https://muquit.github.io/javadoc-test/](https://muquit.github.io/javadoc-test/)
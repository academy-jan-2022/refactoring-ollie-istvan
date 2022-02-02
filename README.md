# Refactoring Golf Java 

[![CircleCI](https://circleci.com/gh/codurance/refactoring-code-java/tree/master.svg?style=svg)](https://circleci.com/gh/codurance/refactoring-code-java/tree/master)


Estimated Duration: 2-4 hours

Author: Jason Gorman, Codemanship (based on the SC2010 session run by Ivan Moore, Dave Cleal and Mike Hill)

Language(s)/stacks: Java

Summary:

Refactoring Golf is a game designed to stretch your refactoring muscles and get you to explore your IDE to see what's really possible using shortcuts and automation.

Download either the Java or C# Refactoring Golf projects from GitHub (C# version TBA). 

You will find two versions of every project (labeled ROUND_N_A and ROUND_N_B). The _A project is the before (in gold terms, the "tee"), and the _B project is the after (the "hole").

Your goal is to safely and efficiently as possible refactor the _A code to look like the _B code. You must aim to do it in as few "strokes" as possible, incurring as few points as possible.

A "stroke" is essentially a change made to the code, and every stroke costs you points.

Your pairing partner should carefully score you as follows:

1 point for every change made to the code using a shortcut or automated IDE feature (e.g., an automated refactoring, code template, or Find/Replace)
2 points for every line of code manually edited
Double points for every change made while the code cannot pass the tests after the previous change
Zero points for code formatting (e.g., deleting whitespace)

So, you're looking to refactor the _A code into the _B code using as few manual edits as possible, and keeping the tests passing as much as possible, scoring as few points as you can.

Allow yourselves a maximum of 2 attempts at each round to determine your best score.

HINTS: 

1. You may find that customising your IDE is useful in some of these rounds (e.g. custom code templates, or even custom refactorings.)

2. If possible, it would be a good idea to have the two versions (A and B) of each set of source files open on different machines, as you could easily tie yourself in knots editing the wrong files!

3. Keep that second machine available as a tooling environment. Writing custom tools (scripts, templates etc) costs you zero points in refactoring golf.

Take a look at the Java version at https://github.com/codurance/refactoring-code-java (Original one is here https://github.com/jasongorman/RefactoringGolfJava)

The C#/NUnit (VS2013) version can be found at https://github.com/jasongorman/RefactoringGolfCSharp

### Build and test

On windows use `gradlew.bat` instead of `./gradlew` to build.
You can also install gradle globally and then run just `gradle` and ignore `gradlew` script.

Test:

    ./gradlew clean test




# base64main

This project has a single main class that reads an input text file named 'input.txt' that contains a base64 encoded file and produces a file named 'output.bin' with the decoded data

or...

reads a binady file named 'input.bin' and produces a file named 'output.txt' with the encoded bytes.

Requires gradle.

Usage:

````
gradle clean jar
gradle copyLibs
cd build/libs
java -jar base64main.jar
````

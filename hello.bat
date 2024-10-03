echo off
cls
del *.class

javac -cp .; Hello.java
java -cp .; Hello 5

pause
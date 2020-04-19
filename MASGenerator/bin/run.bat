@Title MFS Generator %Date% %Time%
@set path=C:\Program Files\Java\jdk1.5.0_17\bin
@set CLASSDIR=.\classes;.
@set LOCALCLASSPATH=%LOCALCLASSPATH%;.\commons-lang-2.2.jar;
@set LOCALCLASSPATH=%LOCALCLASSPATH%;.\classes12.jar;
@set LOCALCLASSPATH=%LOCALCLASSPATH%;.\classes111.jar;
@set LOCALCLASSPATH=%CLASSDIR%;%LOCALCLASSPATH%;
@cls
@java -classpath "%LOCALCLASSPATH%" MASGeneratorFromFile -Xincgc -Xms512M -Xmx512M -Xincgc -XSS:256M

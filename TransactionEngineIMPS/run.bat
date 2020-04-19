@Title Message24 - An Enterprise Messaging Service %Date% %Time%
@set path=C:\Program Files\Java\jdk1.6.0\bin
@set CLASSDIR=.\classes;.
@set LOCALCLASSPATH=%LOCALCLASSPATH%;.\lib\log4j-1.2.9.jar
@set LOCALCLASSPATH=%LOCALCLASSPATH%;.\lib\cryptix32.jar
@set LOCALCLASSPATH=%LOCALCLASSPATH%;.\lib\cryptix32-pgp.jar
@set LOCALCLASSPATH=%LOCALCLASSPATH%;.\lib\msbase.jar
@set LOCALCLASSPATH=%LOCALCLASSPATH%;.\lib\msutil.jar
@set LOCALCLASSPATH=%LOCALCLASSPATH%;.\lib\mail.jar
@set LOCALCLASSPATH=%LOCALCLASSPATH%;.\lib\mssqlserver.jar
@set LOCALCLASSPATH=%LOCALCLASSPATH%;.\lib\classes111.jar
@set LOCALCLASSPATH=%LOCALCLASSPATH%;.\lib\classes12.jar
@set LOCALCLASSPATH=%LOCALCLASSPATH%;.\lib\commons-lang-2.2.jar
@set LOCALCLASSPATH=%LOCALCLASSPATH%;.\lib\commons-beanutils-1.7.0.jar
@set LOCALCLASSPATH=%LOCALCLASSPATH%;.\lib\commons-logging-1.0.4.jar
@set LOCALCLASSPATH=%LOCALCLASSPATH%;.\lib\commons-configuration-1.3.jar
@set LOCALCLASSPATH=%LOCALCLASSPATH%;.\lib\commons-collections-3.2.jar
@set LOCALCLASSPATH=%LOCALCLASSPATH%;.\lib\commons-dbutils-1.1.jar
@set LOCALCLASSPATH=%LOCALCLASSPATH%;.\lib\commons-pool-1.3.jar
@set LOCALCLASSPATH=%LOCALCLASSPATH%;.\lib\commons-dbcp-1.2.1.jar
@set LOCALCLASSPATH=%LOCALCLASSPATH%;.\lib\xercesImpl.jar
@set LOCALCLASSPATH=%LOCALCLASSPATH%;.\lib\xml-apis.jar
@set LOCALCLASSPATH=%LOCALCLASSPATH%;.\lib\FDxSDK.jar
@set LOCALCLASSPATH=%LOCALCLASSPATH%;.\lib\quartz-1.6.0.jar
@set LOCALCLASSPATH=%LOCALCLASSPATH%;.\lib\jta.jar
@set LOCALCLASSPATH=%LOCALCLASSPATH%;.\lib\commons-digester-1.8.jar
@set LOCALCLASSPATH=%CLASSDIR%;%LOCALCLASSPATH%;
:x
@cls
@java -hotspot -classpath "%LOCALCLASSPATH%" com.fss.m24.Message24 auto 6000 -Xincgc -Xms512M -Xmx512M -Xincgc -XSS:256M
@echo Start Time %Date% %Time% >> RestartLog.txt

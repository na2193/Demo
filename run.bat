set projectLocation=C:\Users\nasim.ahmed\Desktop\Demo
cd %projectLocation%

set classpath=%projectLocation%\bin;%projectLocation%\lib\*

javac -d bin %projectLocation%\src\application\*.java

java %projectLocation%\bin\application\TestOperations

cd %projectLocation%
java org.testng.TestNG %projectLocation%\testng.xml

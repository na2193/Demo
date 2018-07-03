cd C:\Users\nasim.ahmed\Desktop\Demo\src\application

set projectLocation=C:\Users\nasim.ahmed\Desktop\Demo
cd %projectLocation%
echo Project Location = %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
echo Class Path = %classpath%

javac Operation.Java
javac TestOperations.java

java org.testng.TestNG %projectLocation%\testng.xml



set projectLocation=C:\Users\nasim.ahmed\Desktop\Demo
cd %projectLocation%

echo Project Location = %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
echo Class Path = %classpath%

cd C:\Users\nasim.ahmed\Desktop\Demo\src\application
javac Operation.java
javac TestOperations.java

cd %projectLocation%
java org.testng.TestNG %projectLocation%\testng.xml

cd C:\Users\nasim.ahmed\Desktop\Demo\src\application
javac TestOperations.java

set projectLocation=C:\Users\nasim.ahmed\Desktop\Demo
cd %projectLocation%
echo Project Location = %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
echo Class Path = %classpath%
java org.testng.TestNG %projectLocation%\testng.xml

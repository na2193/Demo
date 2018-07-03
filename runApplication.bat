set projectLocation=C:\Users\nasim.ahmed\Desktop\Demo
cd %projectLocation%
echo Project Location = %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
echo Class Path = %classpath%

javac TestOperations.java

java org.testng.TestNG %projectLocation%\testng.xml

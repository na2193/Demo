set projectLocation=C:\Users\nasim.ahmed\Desktop\Demo
cd %projectLocation%

javac TestOperations.java

echo Project Location = %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
echo Class Path = %classpath%

java org.testng.TestNG %projectLocation%\testng.xml

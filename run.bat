set projectLocation=C:\Users\nasim.ahmed\Desktop\Demo
cd %projectLocation%

set classpath=%projectLocation%\bin;%projectLocation%\lib\*

cd %projectLocation%
java org.testng.TestNG %projectLocation%\testng.xml

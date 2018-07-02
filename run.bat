set projectLocation=C:\Users\nasim.ahmed\Desktop\Demo
cd %projectLocation%
echo Project Location = %projectLocation%

echo Class Path = %classpath%
java org.testng.TestNG %projectLocation%\testng.xml

set projectLocation=C:\Users\nasim.ahmed\Desktop\Demo
cd %projectLocation%

set classpath=%projectLocation%\bin;%projectLocation%\lib\*

javac -d bin %projectLocation%\src\application\*.java

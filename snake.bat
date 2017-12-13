@echo off
echo ==================================
echo =                                =
echo =             Snake              =
echo =                                =
echo ==================================
echo.
echo.
echo Compilando........................
javac -d bin -cp src\com\isa\snake\libraries\sqlite-jdbc-3.21.0.jar;src src\com\isa\snake\*.java
echo.
echo Ejecutando........................
java -cp src\com\isa\snake\libraries\sqlite-jdbc-3.21.0.jar;bin com.isa.snake.Application
exit

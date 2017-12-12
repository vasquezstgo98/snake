# snake
Game of snake

## Compilarlo junto con el driver JDBC
javac -d bin -cp src\com\isa\snake\libraries\sqlite-jdbc-3.21.0.jar;src src\com\isa\snake\*.java

## Ejecucución con el driver
java -cp src\com\isa\snake\libraries\sqlite-jdbc-3.21.0.jar;bin com.isa.snake.Application

@echo off
echo            ............................................................         ..............
echo            .            ==================================            .                .
echo            .            =  .      .....   ............   =            .                .
echo            .            =  .   ....   .   ... *      .   =            .                .
echo            .            =  .   .      .              .   =            .                .
echo            .            =  .....      ................   =            .                .
echo            .            =                                =            .                .
echo            .            ==================================            .                .
echo            .             Instituto Tecnologico de Oaxaca              .          ..............
echo            .                                                          .
echo            .          Ingenieria en Sistemas Computacionales          .           ............
echo            ............................................................           .
echo            .                           HP                             .           .
echo            ............................................................           ............
echo                                   .           .                                              .
echo                                   .           .                                              .
echo                                   .           .                                   ............
echo                                   .           .                                   
echo                             ........................                                   ..
echo                      ______________________________________                           .  . 
echo                      .             Designed by            .                          .    .
echo                      .         Jorge Castillo Diaz        .                         .      .
echo                      .    Erik Jahaziel Reyes Hernandez   .                        ..........
echo                      .   Marco Antonio Rodrigues Morales  .                       .          .            
echo                      .   Carlos Enrique Vasquez Santiago  .                      .            .
echo                      ______________________________________                     .              .
echo Compilando........................
javac -d bin -cp src\com\isa\snake\libraries\sqlite-jdbc-3.21.0.jar;src src\com\isa\snake\*.java
echo.
echo Ejecutando........................
java -cp src\com\isa\snake\libraries\sqlite-jdbc-3.21.0.jar;bin com.isa.snake.Application
exit

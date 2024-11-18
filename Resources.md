# Recursos Java 

## Comenzando

Java es orientado a objetos, por lo que tenemos que familiarizarnos con este paradigma.

- class: contiene todo tu código. 
- main(): es el punto de entrada de tu aplicación.
- IntelliJ gestiona automáticamente el proceso de compilación y las rutas de clases.
- El ; es obligatorio.

* ¿Cómo empezar?
https://www.w3schools.com/java/java_getstarted.asp

* Programación orientada a objetos
https://www.youtube.com/watch?v=DlphYPc_HKk


## Imprimir en terminal

Cuando hacemos backend, necesitamos saber si lo que hacemos es correcto, al no tener la consola del navegador para saber si funciona (como en el frontend), nos vamos a apoyar de nuestra terminal. 

Para eso utilizamos el método print nativo de Java que se encuentra dentro de la clase System.

System.out.println("Hello World!");

- println: imprime el texto y pasa a una nueva línea.
- print: imprime el texto pero no se mueve a una nueva línea.

* Imprimir en terminal
https://www.w3schools.com/java/java_output.asp


## Tipos de datos

Los tipos de datos en java están divididos en dos grupos:

1. Datos primitivos: byte, short, int, long, float, double, boolean y char.
2. Datos no primitivos: String, Array y Class.

Cada tipo de dato tiene una cantidad de memoria en bytes y un rango máximo de valores que puede almacenar dentro de una variable. Mientras menos cantidad de memoria uses, más rápido será acceder a ese dato.

- byte (8 bits) desde -128 hasta 127
- short (16 bits) desde -32.768 hasta 2.147.483.647
- int: 4 bytes (32 bits) desde -2.147.483.648 hasta 2.147.483.647
- long: 8 bytes (64 bits) desde -9.223.372.036.854.775.808 hasta 9.223.372.036.854.775.807
- float (32 bits) desde -3.402823e38 hasta 3.402823e38
- double: 8 bytes (64 bits) desde -1.79769313486232e308 hasta 1.79769313486232e308
- char: 2 bytes (16 bits)
- boolean: (1 bit)
- String: variable

* 8 Bits (1 dígito en el sistema binario) es 1 Byte (unidad de información en la memoria)
https://www.youtube.com/watch?v=thoGwqjPHRM

* Tipos de Datos
https://www.w3schools.com/java/java_data_types.asp

* Variables
https://www.w3schools.com/java/java_variables.asp


## Operadores aritméticos

* suma `+`
  
* resta `-`
  
* multiplicación `*`
  
* división `/`

* módulo `%`

* añadir 1 `++`

* sustraer 1 `--`

* incrementa el valor por el número a la derecha `+=`

* decrementa el valor por el número a la derecha `-=`

* Operadores
https://www.w3schools.com/java/java_operators.asp


## Type Casting

El "type casting" en Java es el proceso de convertir un valor de un tipo de dato a otro. Este proceso puede ser explícito o implícito, dependiendo de la situación y los tipos de datos involucrados.

* Type Casting Implícito (Automático):
Ocurre cuando Java convierte automáticamente un tipo de dato a otro de mayor tamaño o precisión. También conocido como widening conversion.

int intValue = 10;
double doubleValue = intValue;
System.out.println("doubleValue: " + doubleValue);
Resultado: 10.0

* Type Casting Explícito (Forzado):
Ocurre cuando se convierte un tipo de dato a otro de menor tamaño o precisión. También conocido como narrowing conversion. Necesita ser especificado explícitamente en el código.

double doubleValue = 9.78;
int intValue = (int)doubleValue;
System.out.println("intValue: " + intValue); 
Resultado: 9

* Type Casting
https://www.w3schools.com/java/java_type_casting.asp


## Buenas prácticas

- Las clases se escriben con CamelCase.
- Las variables se escriben con lowerCamelCase.






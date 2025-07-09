# Codificador

Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.  

|  a  | e | i | o | u |
|:---:|:-:|:-:|:-:|:--|
|  @  | # | $ | % | * |

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “switch” para la transformación.

### Ejemplo
Por ejemplo, si el usuario ingresa:   
Ayer, lunes, salimos a las once y 10.

La salida del programa debería ser:   
@y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

Investigar método concat de la clase String.
# NUMBER OF LIKES AND DISLIKES

Tu amigo y tú habéis hecho una lista de temas y ambos han votado si el tema les
gusta o no. Han esccrito 0 para indicar que no les gusta y 1 para indicar que les
gusta. Te piden que cuentes el número de temas que les gustan o no les gustan a
los dos.

### Formato de entrada:
-La primera linea contiene una cadena, A, que indica lo que le gusta y
lo que no le gusta a Bob.  
-La segunda línea contiene una cadena, P, que indica lo que le gusta y 
lo que no a Alice.

###  Formato de salida:
Imprime el número de temas que gustan o disgustan a Bob y Alice.

### Restricciones
1 <= |A|, |P| <= 10^5
|A| = |P|
Ambas A y P contiene solo 0 y 1.  
0 para dislikes y 1 para likes.   

| `Ejemplo Entrada` | `Ejemplo Salida` |
|:-----------------:|:----------------:|
| 010101<br/>101101 |        3         |




### Explicación:
A= 010101
P= 101101
A ambos les gusta el 4° y 6° tema y les dsigusta el 5°.
Así que la respuesta es 3 coincidencias.
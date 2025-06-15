# Charging a Phone

Tienes que encontrar la cantidad de tiempo que se tarda en cargar un Smartphone hasta al menos
el nivel de carga T, dado su nivel de carga inicial S. El cargador es inteligente, y carga a 
diferentes velocidades en función del nivel de carga en el Smartphone para evitar daños en la batería.

Suponiendo que la cantidad de carga actual disponible en el telefono es C,
las velocidades a las que se carga el teléfono R en unidades por minuto son las
siguientes:

Nivel de carga actual es C, las tasas R de carga son(en unidades por minuto):

0 <= C <= 10, R= 10

11 <= C <= 230, R= 5

231 <= C <= 559, R= 8

560 <= C <= 1009, R= 2

1010 <= C <= 5000, R= 7

5001 <= C <= 10000, R= 8

10001 <= C <= 1000000000, R= 3

Tienes que encontrar la cantidad de minutos que te llevara cargar el Smartphone
para carga hasta al menos el nivel T, dada la carga inicial S.

### Variables de entrada del método:
S or initCharge: La carga inicial del Smartphone (Integer)  
T or finalCharge: La carga final que el usuario necesita en su teléfono (Integer)

La primera linea contiene Q, el número de consultas. Luego las siguientes
lineas contendran 2 números enteros S y T.

### Valor de retorno del método:
Cantidad de minutos que tomará/tarda la carga (Integer)

### Restricciones:
1<=Q<=100000  
0<=S<=T<=1000000000

### Entrada de muestra:
2 (Q)  
0 5  
10 50

### Salida de muestra:
1  
7

## Explicación

### Primera consulta:
S=0, T=5  
En esta condición R=10, por lo tanto, después de 1 min la carga se convierte
en 0+10 = 10 que es mayor que 5.  
Por lo tanto, el tiempo total de carga: 1 min

### Segunda consulta:
S=10, T=50  
En esta condición se aplica R=10, y la carga se convierte en 10+10=20.  
Ahora la tasa de carga cambia a R=5, entonces después de 6 min más la carga se convierte en 20+5+5+5+5+5+5=50  
Por lotanto, el tiempo total: 7 min.

Intenta hacerlo de la forma más optimizada posible.

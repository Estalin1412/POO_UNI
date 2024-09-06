### Clase de String
#### Forma 1
El programa java, cuando creas variable del mismo tipo de objeto, este busca se sus valores son iguales y lo igualan a una misma dirección
```
String s1 = "Hola"
String s2 = "Hola"
```

#### Forma 2
Esta forma fuerzas a que el porgrama a que cree varibles individualmente, por lo tanto estas son direcciones diferentes
```
String s1 = new String("Hola")
String s2 = new String("Hola")
```

### Estructura DE DECISIÓN
```
if()    {}
else if {}
else    {}
```
#### Operador ternario 
Si es mayor 5>4 retorna 1 y sino retorna 0
```
((5>4)?1;0)
```
### Estructura de decison switch
```
switch(expresion){
    case valor1: Instrucion1;
    case valor2: Instrucion2;
    case valor2: Instrucion2;
    
    default: instruccionDefault;



}
```
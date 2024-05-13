13/05/24
# Notas Personales

### PALABRAS CLAVE:


### RELATO

En la clase de hoy comenzamos con la [Actividad de Métricas de calidad](https://univirtual.uni.pe/pluginfile.php/628866/mod_resource/content/1/Metricas-calidad.pdf). 

Ejemplo:
{fan-in} : Cuántos modulos llaman a un módulo en particular
    High -> buen uso de los módulos
{fan-out}: Cuántos módulos son llamados por un módulo en particular
    High -> Aumenta la complejidad por gran cantidad de dependencias.


Ce: # clases externas utilizadas por la clase actual
Ca: # clases externas que utilizan la clase actual

**Primer Diagrama**

Para la clase Stop:

Ce = {Passenger, Bus} = 2
Ca = {Route,Bus,PassengerGenerator} = 3
?? Al parecer está mal y sale 0.333
I(Inestabilidad) = 2/(3 + 2) = 0.4 

**Segundo Diagrama**

Para la clase PassengerUnloader

Ce = {Passenger} = 1
Ca = {Bus} = 1

I(Inestabilidad) = 1/2 = 0.5


**Cohesión**

Supongamos que tenemos una clase que tiene varios métodos , alguno de los cuales trabajan con atributos de la clase y otros no.

**LCOM**

Es una métrica que mide la falta de cohesión.

**LCOM4**

LCOM4 es una medida que cuenta cuántos conjuntos de métodos diferentes hay en una clase que son
mutuamente no accesibles. Es decir, si no hay una secuencia de accesos a campos compartidos que
pueda conectar un método con otro en la clase. Cada conjunto así define un componente
potencialmente separable de la clase, sugiriendo que la clase puede estar realizando demasiadas
funciones.

LCOM4 = número de componentes conectados

El Ejemplo dado tiene como última respuesta:

Primer Componente:
- Update() -> {GenerateNewPassengers(),stops_}
- GenerateNewPassengers()
- isAtEnd() -> {destination_stop_index_, num_stops_}
- NextStop() -> {destination_stop_index_, num_stops_}
- GetDestinationStop() -> {destination_stop_}

Segundo Componente:
- GetTotalRouteDistance() -> {total_distance, distances_between_}
- GetNextStopDistance() -> {distances_between_}

**Complejidad Ciclomática**

Se cálcula mediante la fórmula: M=E-N+2P
En el Ejemplo 1:

E = 9
N = 8
P = 1
M = 9-8+2*1 = 3
En el Ejemplo 2:
Sale 4, pero en wikipedia dice algo diferente con otra definición: [link](https://en.wikipedia.org/wiki/Cyclomatic_complexity)

***
> La próxima clase veremos 3 tipos de cobertura, cobertura de rutas por ejemplo.
> Revisar constantemente los archivos en univirtual y adicionar al repositorio [REPO DEL CURSO](https://github.com/Jxtrex/Desarrollo-de-Software-2024-1)

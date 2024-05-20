# Evaluación de la calidad a través de escenarios
Grupo 1: Lerzundi, Joshua Del Rosario, Gabriel Quiroz.
- [Respuestas de Joshua](https://github.com/Dgafecb/CC3S2A/blob/master/ActividadAtributosCalidadEscenarios.md)

**Cualidad de Tiempo de Ejecución**

## Availability (Disponibilidad):
Importancia: Nos indica la proporción del tiempo en el que el sistema está disponible y funcional.

Origen: Cliente usando un navegador web 

Estímulo: Cliente ingresa a www.youtube.com.

Entorno: El sistema está operando normalmente, el sistema tiene 7283336 usuarios concurrentes. La latencia de internet es menor de 75ms desde el
navegador de cliente hasta el sitio web.

Artefacto: Sitio web de Youtube

Respuesta: Porcentaje del tiempo en el que el sistema está disponible sobre un periodo de tiempo.

Medida de respuesta:
-   Downtime(Tiempo de inactividad)/Mes (horas): 0.07
-   Uptime/Availability(Disponibilidad) : 99.99%

## Reliability (Confiabilidad):
I

## Security (Seguridad):
Importancia: La seguridad de un sistema establece límites en el uso de este lo que apunta a prevenir cualquier 
manejo malicioso de la información que el sistema contiene.

Origen: Cliente usando un navegador web estándar(Firefox)

Estímulo: Cliente marcando uno de sus videos como privado.

Entorno: El sistema está operando normalmente, el sistema tiene 7283336 usuarios concurrentes. La latencia de internet es menor de 75ms desde el navegador del cliente hasta el sitio web.

Artefacto: Sitio web de Youtube

Respuesta: Disponibilidad del video privado para un usuario distinto al propietario del video.

Medida de respuesta:
-   El video **NO** se encuentra disponible para un usuario distinto al propietario del video
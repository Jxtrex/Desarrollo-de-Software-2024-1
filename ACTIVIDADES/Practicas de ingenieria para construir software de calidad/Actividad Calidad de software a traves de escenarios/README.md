# Evaluación de la calidad a través de escenarios
Grupo 1: Lerzundi, Joshua Del Rosario, Gabriel Quiroz.

- [Respuestas de Joshua](https://github.com/Dgafecb/CC3S2A/blob/master/ActividadAtributosCalidadEscenarios.md)


**Atributo de Calidad de Tiempo de Ejecución**

Fuente:[link](https://learn.microsoft.com/en-us/previous-versions/msp-n-p/ee658094(v=pandp.10))

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

## Scalability (Escalabilidad):
Importancia: La capacidad de crecimiento en los recursos de un sistema garantiza que no haya interrupción en la experiencia del usuario en el aspecto de capacidad del sistema.

Origen: Gran flujo de nuevos clientes usando un navegador web estándar(Firefox)

Estímulo: Gran flujo de nuevos clientes subiendo un video

Entorno: El sistema está operando normalmente, el sistema tiene 7283336 usuarios concurrentes que usan 4.3 Petabytes del almacenamiento de Youtube. La latencia de internet es menor de 75ms desde el navegador del cliente hasta el sitio web.

Artefacto: Sitio web de Youtube

Respuesta: Capacidad de almacenamiento de sistema.

Medida de respuesta:
-   El sistema tiene una capacidad de almacenamiento de 15 Exabytes.
-   Al ritmo del uso diario de los usuarios luego de 9.5 años Youtube tendrá que aumentar su capacidad de almacenamiento.  

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
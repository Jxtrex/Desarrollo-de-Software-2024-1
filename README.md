# Desarrollo-de-Software-2024-1
## Sonarqube
[Instalar SonarQube](ACTIVIDADES/README.md)

- Iniciar: `sudo systemctl start sonar`
- Detener: `sudo systemctl stop sonar`
- Estado: `sudo systemctl status sonar`

## Sonarlint
Instalamos la extensión de Sonarlint para IntelliJ IDEA y enlazamos mediante el menú de configuración a la conexión de Sonarqube que acabamos de crear.

### Ejecutamos el escaneador de Sonarqube para nuestro proyecto en Gradle

Pegamos lo siguiente en el archivo `build.gradle` de nuestro proyecto:

\# Código para proyecto de muestra de la [actividad](ACTIVIDADES/Codigo%20limpio,%20analisis%20de%20codigo%20estatico%20y%20dinamico/Sonarqube-and-sonarlint-guide%20main%20microwave/) de Sonarqube
```java
plugins {
    id "org.sonarqube" version "3.5.0.2730"
}

```

Nos dirigimos al bloque de `sonarqube`:
```java
sonar {
    properties {
        property "sonar.projectKey", "ayudantias_microwave"
        property "sonar.organization", "ayudantias"
        property "sonar.token", ""
        property "sonar.host.url", "http://sonarcloud.io"
    }
}
```
- Cambiamos `"ayudantias_microwave"` por el nombre de nuestra conexion? `CodigoEstatico1`.
- Eliminamos la linea de `sonar.organization` porque estamos en una versión antigua, a diferencia de sonarcloud que usa la última versión y usa organizaciones.
- Cambiamos `sonar.token` por `sonar.login` y el siguiente parámetro `""` por `<token que copiamos al crear la conexion con el proyecto>`.
- Cambiamos `http://sonarcloud.io` por `http://localhost:9000`

Finalmente recompilamos gradle y corremos el bloque de sonar como si fuera un test.
![alt text](<Recursos varios/CORRER SONA DESDE INTELLIJ.PNG>)

## Docker
> Ante la duda usa `sudo`
 
[Instalar Docker](ACTIVIDADES/README.md)

**Levantar un entorno de desarrollo con Docker compose** 

[Archivo YAML para la Actividad de Sonarqube](ACTIVIDADES/Codigo%20limpio,%20analisis%20de%20codigo%20estatico%20y%20dinamico/microwave-docker/docker-compose.yml)
- Levantar el contenedor con un archivo yml en la carpeta actual: `docker compose up -d`
- Eliminar el contenedor: `docker compose down`

**Comandos útiles**
- Ver contenedores corriendo: `sudo docker ps`
- Ver todos los contenedores: `sudo docker ps -a`
- Ver logs: `sudo docker logs <container_id>`

 
# Desarrollo-de-Software-2024-1
## Mapa del Repositorio
```
└── 📁Lerzundi-CC3S2_2024-1
    └── 📁ACTIVIDADES
        └── 📁Codigo limpio, analisis de codigo estatico y dinamico
        └── 📁Codigo limpio, refactorizacion, calidad de software
        └── 📁Desarrollo de software con metodologias agiles
        └── 📁Introduccion al Proceso de Desarrollo de Software
        └── 📁Metodologias agiles
        └── README.md
        └── 📁Refactorizacion y calidad de software
        └── 📁Scrum
        └── 📁Scrum para el desarrollo del software
        └── TODO.md
    └── 📁ExamenFinal-CC3S2
    └── 📁ExamenParcial-CC3S2
    └── 📁NOTAS PERSONALES
    └── 📁PracticaCalificada1- CC3S2
    └── README.md
    └── 📁Recursos varios
```

## Sonarqube
[Instalar SonarQube](ACTIVIDADES/README.md#install-sonarqube)

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
 
[Instalar Docker](ACTIVIDADES/README.md#install-docker)

### Levantar un entorno de desarrollo con Docker compose 

[Archivo YAML para la Actividad de Sonarqube](ACTIVIDADES/Codigo%20limpio,%20analisis%20de%20codigo%20estatico%20y%20dinamico/microwave-docker/docker-compose.yml)
- Levantar el contenedor con un archivo yml en la carpeta actual: `docker compose up -d`
- Eliminar el contenedor: `docker compose down`

### Levantar un entorno de desarrollo con Docker

[Dockerfile para Infer(Facebook)](https://github.com/facebook/infer/blob/main/docker/1.1.0/Dockerfile)
- Primero se crea un archivo **Dockerfile** sin extensión, en el que se introducen todas las aplicaciones/servicios a instalar en el contenedor.
- Luego corremos `sudo docker build -t infer .` (infer es el nombre del contenedor) estando en el directorio del **Dockerfile**
- Finalmente corremo levantamos el contenedor con `sudo docker run -dp 127.0.0.1:3000:3000 infer`, (usamos `-t` si queremos que siga corriendo en segundo plano)

**Comandos útiles**

- Ver contenedores corriendo: `sudo docker ps`, `sudo docker container ls`
- Ver todos los contenedores: `sudo docker ps -a`,`sudo docker container ls -a`
- Ver todos los contenedores por ID: `sudo docker container ls -aq`
- Ver todas las imágenes: `sudo docker image ls`
- Detener contenedor: `sudo docker container stop my_container_name`
- Reanudar contenedor: `sudo docker container start my_container_name`
- Reiniciar contenedor corriendo: `sudo docker container restart my_container_name`
- Eliminar contenedor detenido: `sudo docker container rm my_container_name`
- Ver logs: `sudo docker logs <container_id>`

**Fuentes**:

- [Gestión de contenedores](https://phoenixnap.com/kb/remove-docker-images-containers-networks-volumes)
- [Contenedor que se cierra prematuramente](https://stackoverflow.com/a/45270860)
 
## Kubernetes
> [Instalar Kubernetes](ACTIVIDADES/README.md#instalar-kubernetes)  
> [Link de la guía](https://kubernetes.io/docs/tasks/tools/install-kubectl-linux/#install-using-native-package-management)

Para correr Kubernetes es necesario usar docker sin el comando sudo, [link](https://docs.docker.com/engine/install/linux-postinstall/#manage-docker-as-a-non-root-user).

### Kubectl  
> [Instalar kubectl](ACTIVIDADES/README.md#instalamos-kubectl)  
 
**Verificamos la versión de kubectl**
```shell
kubectl version --client
```

### Minikube
> [Instalar minikube](ACTIVIDADES/README.md#instalamos-minikube)  
 
 **Iniciar el cluster**
```shell
minikube start
```


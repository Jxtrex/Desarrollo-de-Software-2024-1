# Desarrollo y despliegue de una aplicación con Docker, Docker Compose, Kubernetes y microservicios

### Configurar y ejecutar contenedores Docker

Creamos la siguiente estructura con el código provisto en la actividad.

```
└── 📁java
    └── Dockerfile
    └── Enemy.java
    └── Map.java
    └── Player.java
    └── Tower.java
    └── TowerDefenseGame.java
    └── Wave.java
```

Nuestro archivo de Dockerfile contendrá  

```dockerfile
FROM openjdk:11
WORKDIR .
COPY . .
RUN javac TowerDefenseGame.java
CMD ["java","TowerDefenseGame"]
```

Ahora creamos la imagen a partir del `Dockerfile`

```shell
docker build -t tower-defense-game
```

Y ejecutamos la imagen

```shell
docker run -it --name tower-defense-container tower-defense-game
```

Comprobamos que se ejecutó correctamente insertando un mensaje en el método main.

```java
public static void main(String[] args) {
        System.out.println("TEST");
    }
```

![alt text](../recursos/docker-run-tower-defense-game.png)

### Configurar redes y volúmenes en Docker

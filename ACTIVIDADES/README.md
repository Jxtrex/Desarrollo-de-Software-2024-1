# Actividades del Curso
## Install Sonarqube in Ubuntu Linux
[link de la guía](https://github.com/DagmarLV/Sonarqube-and-sonarlint-guide)
### Increase Limits

These steps will increase the limits for the sonarqube user and set the parameters for optimal functioning of SonarQube.

1. Edit the `limits.conf` file using the command:
    
    ```
    sudo nano /etc/security/limits.conf
    ```
    
2. Paste the following values at the bottom of the file:
    
    ```
    sonarqube   -   nofile   65536
    sonarqube   -   nproc    4096
    ```
    
3. Edit the `sysctl.conf` file using the command:
    
    ```
    sudo nano /etc/sysctl.conf
    ```
    
4. Paste the following value at the bottom of the file:
    
    ```
    vm.max_map_count = 262144
    ```
    
5. Reboot your system to apply the new limits:
    
    ```
    sudo reboot
    ```

### **Install Sonarqube**

1. Install Sonarqube using the following commands:
    
    ```jsx
    sudo wget https://binaries.sonarsource.com/Distribution/sonarqube/sonarqube-9.9.0.65466.zip
    sudo apt install unzip
    sudo unzip sonarqube-9.9.0.65466.zip -d /opt
    sudo mv /opt/sonarqube-9.9.0.65466 /opt/sonarqube
    sudo groupadd sonar
    sudo useradd -c "user to run SonarQube" -d /opt/sonarqube -g sonar sonar
    sudo chown sonar:sonar /opt/sonarqube -R
    ```
    
2. Create service for Sonarqube
    
    ```jsx
    sudo nano /etc/systemd/system/sonar.service
    ```
    
3. Paste the following into the file:
    
    ```jsx
    [Unit]
    Description=SonarQube service
    After=syslog.target network.target
    
    [Service]
    Type=forking
    
    ExecStart=/opt/sonarqube/bin/linux-x86-64/sonar.sh start
    ExecStop=/opt/sonarqube/bin/linux-x86-64/sonar.sh stop
    
    User=sonar
    Group=sonar
    Restart=always
    
    LimitNOFILE=65536
    LimitNPROC=4096
    
    [Install]
    WantedBy=multi-user.target
    ```
    
4. Start Sonarqube and Enable service
    
    ```
    sudo systemctl start sonar
    sudo systemctl enable sonar
    sudo systemctl status sonar
    sudo tail -f /opt/sonarqube/logs/sonar.log
    ```
### **Access the Sonarqube UI**

After completing the installation, you can access the SonarQube web interface by navigating to [`http://localhost:9000`](http://localhost:9000/) in your web browser. 

Please note that by default, SonarQube creates a user with Administrator privileges. You can log in with the following credentials: 

`Username: admin` 

`Password: admin`

> After logging in for the first time, the website will ask you to change your password for security reasons.

## Install Docker
[link de la guía](https://docs.docker.com/engine/install/ubuntu/)

Primero corremos el siguiente comando para eliminar todos los paquetes que causen conflictos con docker:

```bash
for pkg in docker.io docker-doc docker-compose docker-compose-v2 podman-docker containerd runc; do sudo apt-get remove $pkg; done
```

### Install using the apt repository
Primero:

\# **Add Docker's official GPG key:**

```bash
sudo apt-get update
sudo apt-get install ca-certificates curl
sudo install -m 0755 -d /etc/apt/keyrings
sudo curl -fsSL https://download.docker.com/linux/ubuntu/gpg -o /etc/apt/keyrings/docker.asc
sudo chmod a+r /etc/apt/keyrings/docker.asc
```
Luego:

\# **Add the repository to Apt sources:**
```bash
echo \
  "deb [arch=$(dpkg --print-architecture) signed-by=/etc/apt/keyrings/docker.asc] https://download.docker.com/linux/ubuntu \
  $(. /etc/os-release && echo "$VERSION_CODENAME") stable" | \
  sudo tee /etc/apt/sources.list.d/docker.list > /dev/null
sudo apt-get update
```
\# **Install the Docker packages**

```bash
sudo apt-get install docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin
```
\# **Verifiy Docker installation**

```bash
sudo docker run hello-world
```
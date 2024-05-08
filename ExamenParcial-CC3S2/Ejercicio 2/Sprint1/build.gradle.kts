plugins {
    id("java")
    id("org.sonarqube") version "3.5.0.2730"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
    testImplementation("org.assertj:assertj-core:3.22.0")
}
//sonar {
//    properties {
//        property("sonar.projectKey"); "ExamenParcial"
//        property("sonar.login"); "sqp_f4bb4a4b416d6cc2e932c714a808d5e7d392de91"
//        property("sonar.host.url"); "http://localhost:9000"
//    }
//}
//-Dsonar.projectKey=ExamenParcial \
//-Dsonar.host.url=http://localhost:9000 \
//-Dsonar.login=sqp_f4bb4a4b416d6cc2e932c714a808d5e7d392de91
tasks.test {
    useJUnitPlatform()
}

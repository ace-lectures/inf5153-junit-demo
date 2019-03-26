# Démonstration "live"

  * Auteur : Sébastien Mosser
  * Version : 2019.03


## Étape 0 : Environement technique

  * Créer l'architecture de repertoire

```
mkdir inf5153-junit-demo
cd inf5153-junit-demo/
touch pom.xml
mkdir -p src/main/java
touch .gitignore
git init
touch .travis.yml
```

  * Spécifier le contenu du `pom.xml`

```
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
  http://maven.apache.org/maven-v4_0_0.xsd">

  <modelVersion>4.0.0</modelVersion>
  <packaging>jar</packaging>

  <groupId>io.github.ace-lectures.inf5153</groupId>
  <artifactId>junit-demo</artifactId>
  <version>1.0-SNAPSHOT</version>
  <name>ACE :: INF5153 :: Junit Demo</name>

  <properties>
    <maven.compiler.source>11</maven.compiler.source>
    <maven.compiler.target>11</maven.compiler.target>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  </properties>

  <build>
    <plugins>
      <plugin>
        <groupId>org.codehaus.mojo</groupId>
        <artifactId>exec-maven-plugin</artifactId>
        <version>1.6.0</version>
        <configuration>
          <mainClass>Main</mainClass>
        </configuration>
      </plugin>
    </plugins>
  </build>

</project>
```

  * Spécifier le contenu du fichier `.gitignore`

```
.idea/
target/
*~
*.iml
```

  * Spécifier le contenu du fichier `.travis.yml`

```
language: java

jdk:
  - openjdk11

notifications:
  email:
    on_success: never
    on_failure: always
```

  * charger le projet dans IntelliJ
    * `Import Project`
    * `Import Project from external model` / `Maven`
      * Cocher `Import Maven projects automatically` 
      * Et `Next` jusqu'a la fin (en JDK 11)

  * Créer une classe `Main` à la racine
    * (Montrer le raccourci `psvm`)
    * (Montrer le raccourci `sout`)

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("# JUnit Demonstration");
    }
}
``` 

## Étape 1 : Assertions

  * Créer un package `uutf` (UQAM Unit Test Framework)
  * Créer une classe `Assertions`
  * Définir statiquement `assertTrue` par levée d'une `AssertionError`
  * Définir statiquement `assertFalse` et `AssertEquals` par réutilisation de `assertTrue`
  * Mettre à jour le main pour tester les deux cas d'exemple

```java
public static void main(String[] args) {
    System.out.println("# JUnit Demonstration");
    try {
        System.out.println("## Case 1: x+y == 2");
        int x = 1;
        int y = 1;
        assertEquals(2, x+y);
        System.out.println("PASSED");
    } catch(AssertionError ae) {
        System.out.println("FAILED");
    }
    try {
        System.out.println("## Case 2: x-y == 1");
        int x = 1;
        int y = 1;
        assertEquals(1, x-y);
        System.out.println("PASSED");
    } catch(AssertionError ae) {
        System.out.println("FAILED");
    }
}
```

  * compiler et éxécuter: `mvn clean package; mvn -q exec:java` 

  
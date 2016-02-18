# NumberGenerator
Fei Luo's Java Codes show how to create Java project from maven

Demo Link: [使用Maven创建Java项目](http://www.yiibai.com/maven/create-a-java-project-with-maven.html)

### Steps

1. mvn archetype:generate -DgroupId=com.yiibai -DartifactId=NumberGenerator -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
3. mvn eclipse:eclipse
3. update pom.xml(check [Maven中心储存库](http://search.maven.org/))
4. coding, enjoy :) ...
5. mvn package
6. java -cp target/NumberGenerator-1.0-SNAPSHOT.jar com.yiibai.App
# usar java 1.7

export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home

export PATH=$JAVA_HOME/bin:$PATH

# para costruir el jar
/opt/apache-maven-3.6.3/bin/mvn clean compile assembly:single

# para ejecutarlo
java -jar target/CarRESTClient-0.0.1-SNAPSHOT-jar-with-dependencies.jar

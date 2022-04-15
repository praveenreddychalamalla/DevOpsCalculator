FROM openjdk:11

WORKDIR /calculatorapp

COPY ./ ./

CMD ["java", "-cp", "./target/DevOpsCalculator-1.0-SNAPSHOT.jar", "calculator.Calculator"]



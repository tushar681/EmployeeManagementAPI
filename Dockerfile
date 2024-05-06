From openjdk:18
copy ./target/employee-management-api-0.0.1-SNAPSHOT.jar employee-management-api-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","employee-management-api-0.0.1-SNAPSHOT.jar"]
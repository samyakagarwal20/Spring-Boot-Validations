# Spring-Boot-Validations
It is a sample spring boot application to demonstrate the different types of validations provided by Spring Validation module

### Prerequisites for running the application:

---
Please make sure to have an active instance of MySQL DB running on your system before starting the application.

In case, if you don't have MySQL installed on your system then you could also simply run a container from the mysql image (taken from DockerHub) using the following command:

```docker run --name mysqldb -p 3306:3306 -e MYSQL_ROOT_PASSWORD=password -d mysql```

Once the container is in running state (which you could verify either using docker desktop app or using the command ```docker ps```), you can make use of MySQL Workbench to validate the connection with your running container on port **3306**.

The password specified for mysql DB **root** acoount is **password** :)

---
Once we are done with validating the connection, we need to create the target database as pracDB (the name of the database which I am using in my application).

We can do it either by using MySQL Workbench or by executing the following command in console

```docker exec -it mysqldb mysql -u root -p```

This command prompts for the root password which we specified at the time of running the container. After entering the correct credentials, we get the access to the mysql client where we can execute the SQL query as ```create database pracDB```

We could also create the database with some other name but make sure to change the **spring.datasource.url** property accordingly in application.yaml file.

---
In this method, we have explicitly defined a datasource and a corresponding JdbcTemplate object to perform the setup by referring to the properties defined in the application.yaml file.

The configuration are done within the file **JDBCConfig.java**

---

## Spring Validation

Spring Validation is a feature provided by the Spring Framework to facilitate the validation of objects and data in a consistent and customizable manner. It helps ensure that the data submitted to your application is accurate, complete, and meets certain criteria before it is processed further. This is particularly useful for web applications, where user input needs to be validated before it is stored in a database or used in any business logic.

The following are the different validations that we can use:

* ```@NotNull``` - Ensures a field is not null.
* ```@NotEmpty``` - Ensures a field is not null and not empty.
* ```@NotBlank``` - Ensures a string field is not null, not empty, and not just whitespace.
* ```@Size``` - Validates the size of a field (e.g., string length, collection size).
* ```@Min``` - Validates that a numeric field is greater than or equal to a specified minimum value.
* ```@Max``` - Validates that a numeric field is less than or equal to a specified maximum value.
* ```@DecimalMin``` - Validates that a numeric field is greater than or equal to a specified minimum decimal value.
* ```@DecimalMax``` - Validates that a numeric field is less than or equal to a specified maximum decimal value.
* ```@Digits``` - Validates that a numeric field has a specified number of integer and fraction digits.
* ```@Pattern``` - Validates that a field matches a regular expression pattern.
* ``@Email`` - Validates that a string is a valid email address.
* ```@Future``` - Validates that a date or time is in the future.
* ```@Past``` - Validates that a date or time is in the past.
* ```@AssertTrue``` - Validates that a boolean field is true.
* ```@AssertFalse``` - Validates that a boolean field is false.
* ```@Valid``` - Cascades validation to associated objects (used with nested objects or collections).
* ```@NotNull(groups = {Group1.class})``` - Conditional validation based on validation groups.
* ```@Size.List``` - Combines multiple @Size annotations for composite validation.
* ```@Validated``` - Specifies validation group(s) at the class level.
* ```@CreditCardNumber``` - Validates that a string is a valid credit card number.
* ```@URL``` - Validates that a string is a valid URL.
* ```@Range``` - Validates that a numeric field is within a specified range (inclusive).
* ```@Positive``` - Validates that a numeric field is positive (greater than 0).
* ```@PositiveOrZero``` - Validates that a numeric field is positive or zero.
* ```@Negative``` - Validates that a numeric field is negative (less than 0).
* ```@NegativeOrZero``` - Validates that a numeric field is negative or zero.
* ```@FutureOrPresent``` - Validates that a date or time is in the future or the present.
* ```@PastOrPresent``` - Validates that a date or time is in the past or the present.

```
NOTE: The usage of most of these validations are already demonstrated in this application
```

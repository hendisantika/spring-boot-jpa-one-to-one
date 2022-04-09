# spring-boot-jpa-one-to-one

### Things todo list:

1. Clone this repository: `git clone https://github.com/hendisantika/spring-boot-jpa-one-to-one.git`
2. Navigate to the folder: `cd spring-boot-jpa-one-to-one`
3. Replace PostgreSQL credentials with your own
4. Run the application: `mvn clean spring-boot:run`
5. Import POSTMAN Collection

### Image Screen shot

Add New Employee

![Add New Employee](img/add.png "Add New Employee")

```shell
curl --location --request POST 'http://localhost:8080/employees' \
--header 'Content-Type: application/json' \
--data-raw '{
    "employeeName":"asjdajshdkasjd",
    "employeeCode": "A001",
    "designation": "Software Developer",
    "address": {
        "doorNumber": "212",
        "street":"New Street",
        "city": "Bandung"

    }

}'
```

List All Employee

![List All Employee](img/list.png "List All Employee")

```shell
curl --location --request GET 'http://localhost:8080/employees'
```

Get Employee By ID

![Get Employee By ID](img/get.png "Get Employee By ID")

```shell
curl --location --request GET 'http://localhost:8080/employees/1'
```

Update Employee By ID

![Update Employee By ID](img/update.png "Update Employee By ID")

```shell
curl --location --request GET 'http://localhost:8080/employees/2' \
--header 'Content-Type: application/json' \
--data-raw '{
    "employeeName": "Uchiha Madara",
    "employeeCode": "A002",
    "designation": "Software Developer",
    "address": {
        "doorNumber": "212",
        "street": "New Street",
        "city": "Bandung"
    }
}'
```

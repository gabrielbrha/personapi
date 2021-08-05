
# Person API

> A REST API with Spring Boot for registering and managing people in an organization, deployed in the cloud (Heroku). An exercise to see the main REST architectural style concepts involved during project development.

## Prerequisites

> - An IDE of your choice
> - **Java** with version greater than or equal to 8 - [Java Donwload](https://www.java.com)

## Installation

> - Clone this project in your machine with the command:
> ```
> 	git clone https://github.com/caiomcs04/personalapi.git
> ```

## Execution in localhost

> - Open **personalapi** folder using an IDE of your choice
>
> - Load marven changes in pom.xml file if your IDE doesn't do it automatically
>
> - Run PersonalapiApplication(~/personalapi/src/main/java/one/dio/personalapi)
>
> - After starting the service go to [H2 memory bank](http://localhost:8083/h2)
>
> - Change **JDBC URL** to **jdbc:h2:~/personalapi**
>
> ![Captura de tela de 2021-07-03 13-24-10](https://user-images.githubusercontent.com/66964367/124360783-082acc80-dc02-11eb-944c-58aabe735d21.png)
>
> - Then press conect to get access to memory bank
>
> - You can execute any crud using an API develoment plataform of your choice
>
> - Or you can use [Swagger](http://localhost:8083/swagger-ui.html#/) as well
> 
>![Captura de tela de 2021-07-03 13-26-51](https://user-images.githubusercontent.com/66964367/124360844-5b048400-dc02-11eb-89f5-06c6ec4a7e74.png)

## Execution throuh Heroku

> - To access H2 memory bank, go to [Heroku H2](https://peoplea-dio-api.herokuapp.com/h2)
> 
> - You can execute any crud using an API develoment plataform of your choice.
> - To work with [People Entity] (https://peoplea-dio-api.herokuapp.com/people)
> - To work with [Phone Entity] (https://peoplea-dio-api.herokuapp.com/phone)
> 
> - Or you can use [Swagger](https://peoplea-dio-api.herokuapp.com/swagger-ui.html#/) as well

## Functionalities

> - Localhost
> You will be able to test all functionalities in [Swagger](http://localhost:8082/swagger-ui.html#/) 
> And also will be able to check the data base in [H2](http://localhost:8082/h2)

> - Heroku
> You will be able to test all functionalities in [Swagger](https://peoplea-dio-api.herokuapp.com/swagger-ui.html) 
> And also will be able to check the data base in [H2](https://peoplea-dio-api.herokuapp.com/h2)

## Contribution

> - To contribute to this project, fork this project, make the changes you want and create a pull request.

## Authors

> - **Caio Moreira de Carvalho Sampaio** - [Linkedin](https://www.linkedin.com/in/caio-sampaio-b02a3669/) | [Email](caio6c@yahoo.com.br)

## Special thanks 

> Digital Innovation One and Satander Bank for the fullstack scholarship opportunity

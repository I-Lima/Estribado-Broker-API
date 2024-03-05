# Mandacaru Broker API

###### Não fala inglês? <a href="https://github.com/I-Lima/Mandacaru-Broker-API/blob/main/README.md">Clique aqui</a> para ver está página em português

## Table of Contents

- [Mandacaru Broker API](#mandacaru-broker-api)
  - [Table of Contents](#table-of-contents)
  - [Description](#description)
    - [What is a home broker?](#what-is-a-home-broker)
  - [Developers](#developers)
  - [Resources](#resources)
    - [Get All Registers](#get-all-registers)
    - [Get Register](#get-register)
    - [Create Register](#create-register)
    - [Update Register](#update-register)
    - [Delete Register](#delete-register)
  - [Postman Collection](#postman-collection)
  - [Swagger](#swagger)
  - [Testing](#testing)
  - [Step-by-Step Environment Setup](#step-by-step-environment-setup)
  - [Requiriments](#requirements)
  - [Technologies Used](#technologies-used)
  - [Contributions](#contributions)
  - [License](#license)

## Description

A Mandacaru Broker API é uma aplicação Spring Boot que fornece operações CRUD (Create, Read, Update, Delete) para gerenciar informações sobre ações (stocks).

### What is a Home Broker?

A Home Broker is an online platform that allows investors to buy and sell financial assets,
such as stocks, options, government bonds, among others, directly over the internet. Through it, investors can
access real-time market information, analyze charts, execute buy and sell orders,
monitor their investment portfolios, among other features, all online.

If you want to learn more about Home Broker and how it works,
visit the B3 (Brazilian stock exchange) : [How to operate with Homebroker](https://edu.b3.com.br/play/curso/21491369?institution=edub3?gclid=Cj0KCQiA2eKtBhDcARIsAEGTG41VZsqjGKousZxPKj1yB86mGX_QKuBxdxrg-qM9ymZ4w6mBQFPk930aArFTEALw_wcB)

## Developers

The project was developed in collaboration by the following developers:

<div style="display: flex; justify-content: center;">
  <a href="https://github.com/I-Lima">
    <img src="https://avatars.githubusercontent.com/u/83174653?s=400&u=515b4de4d50855ea8a8dea0d554e3ed0d87bca9d&v=4"  width="80px"/>
  </a>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <a href="https://github.com/uezili">
    <img src="https://avatars.githubusercontent.com/u/40150125?s=48&v=4"  width="80px"/>
  </a>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <a href="https://github.com/jaopaulomilitao">
    <img src="https://avatars.githubusercontent.com/u/143536750?v=4"  width="80px"/>
  </a>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <a href="https://github.com/moisesocosta">
    <img src="https://avatars.githubusercontent.com/u/60359281?v=4"  width="80px"/>
  </a>
</div>

## Resources

### Get all registers

Returns an array of objects with all records in the table.

**Endpoint:**

```http
GET /stocks
```

### Get register

Returns the specified record object.

**Endpoint:**

```http
GET /stocks/{id}
```

### Create register

Returns the object with the sent data.

**Endpoint:**

```http
POST /stocks
```

**Corpo da Solicitação (Request Body):**

```JSON
{
  "symbol": "BBAS3",
  "companyName": "Banco do Brasil SA",
  "price": 56.97
}

```

### Update register

Returns the object with the sent data

**Endpoint:**

```http
PUT /stocks/{id}
```

**Corpo da Solicitação (Request Body):**

```JSON
{
  "symbol": "BBAS3",
  "companyName": "Banco do Brasil SA",
  "price": 56.97
}

```

### Delete register

No return.

**Endpoint:**

```http
DELETE /stocks/{id}
```

## Postman Collection

The following collection includes all configured routes, along with their corresponding API tests already implemented.
[Download link](https://drive.google.com/file/d/1G9hVXLiOBNB_Zi5lONOyz7CmCpJ7u6J_/view?usp=sharing)

## Swagger
Swagger is an open-source tool that enables clear and interactive documentation of APIs.
This interface simplifies understanding and integration with the Mandacaru Broker API.

`http://localhost:8080/swagger-ui/index.html#/`

## Testing

This repository has undergone static analysis using Checkstyle, SonarQube, and SonarLint tools. Additionally, it has unit test cases organized by classes, as well as an integration test that verifies the CRUD operations of the API.

## Step-by-Step Environment Setup

1. Clone the repository: `git clone https://github.com/I-Lima/Mandacaru-Broker-API.git`
2. Import the project into your preferred IDE.
3. To run the database in Docker, use the following command:

   ```bash
   docker-compose up -d
    ```

4. Run the Spring Boot application.
5. Access the API at `http://localhost:8080`.

## Requirements

- Java 11 or higher
- Maven
- Banco de dados
- Docker

## Technologies Used

- Spring Boot
- Spring Data JPA
- Maven
- JUnit
- Mockito
- JaCoCo
- Checkstyle
- SonarQube
- SonarLint
- PostgresSQL
- Docker
- Docker Compose

## Contributions

Contributions are welcome!

## License

This project is licensed under the [MIT License](LICENSE).

<img src="./public/footer.png" width=" 100%" />

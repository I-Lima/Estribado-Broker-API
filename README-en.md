# Mandacaru Broker API

###### Não fala inglês? <a href="https://github.com/I-Lima/Mandacaru-Broker-API/blob/main/README.md">Clique aqui</a> para ver está página em português

## Table of Contents

- [Mandacaru Broker API](#mandacaru-broker-api)
  - [Table of contents](#table-of-contents)
  - [Description](#description)
    - [What is a home broker?](#what-is-a-home-broker)
  - [Developers](#developers)
  - [Resources](#resources)
    - [System login](#system-login)
    - [System registration](#system-registration)
    - [Delete system registration](#delete-system-registration)
    - [Get all exchange traded funds](#get-a-specific-exchange-traded-fund)
    - [Get a specific Exchange Traded Fund](#get-a-specific-exchange-traded-fund)
    - [Register an Exchange Traded Fund](#register-an-exchange-traded-fund)
    - [Update an Exchange Traded Fund](#update-an-exchange-traded-fund)
    - [Delete an Exchange Traded Fund](#delete-an-exchange-traded-fund)
    - [List all investments](#list-all-investments)
    - [Register a new investment](#register-a-new-investment)
    - [Delete an investment](#delete-an-investment)
    - [List all real estate funds](#list-all-real-estate-funds)
    - [Get a specific real estate fund](#get-a-specific-exchange-traded-fund)
    - [Register a new real estate fund](#register-a-new-real-estate-fund)
    - [Update a specific real estate fund](#update-an-exchange-traded-fund)
    - [Delete a specific real estate fund](#delete-a-specific-real-estate-fund)
    - [Get all registers](#get-all-registers)
    - [Get register](#get-register)
    - [Create register](#create-register)
    - [Update register](#update-register)
    - [Delete register](#delete-register)
    - [List all assets](#list-all-assets)
    - [Get a specific asset](#get-a-specific-asset)
    - [Register an asset](#register-an-asset)
    - [Update an asset](#update-an-asset)
    - [Delete an asset](#delete-an-asset)
    - [User system login](#user-system-login)
    - [User system registration](#user-system-registration)
    - [Update user in the system](#update-user-in-the-system)
    - [Delete user in the system](#delete-user-in-the-system)
  - [Postman collection](#postman-collection)
  - [Swagger](#swagger)
  - [Testing](#testing)
  - [Step-by-Step environment setup](#step-by-step-environment-setup)
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

### System login

Logs into the system.

**Endpoint:**

```http
POST /auth/login
```

**Responses:**

```http
200: Successful login
400: Invalid credentials
401: User not registered
```

### System registration

Registers in the system.

**Endpoint:**

```http
POST /auth/register
```

**Responses:**

```http
200: Successful registration
409: User already registered
```

### Delete system registration

Deletes the registration in the system.

**Endpoint:**

```http
DELETE /auth/{id}
```

**Responses:**

```http
200: Successful deletion
```

### Get all Exchange Traded Funds

Returns all available Exchange Traded Funds.

**Endpoint:**

```http
GET /etf
```

### Get a specific Exchange Traded Fund

Returns details of a specific Exchange Traded Fund based on the provided ID.

**Endpoint:**

```http
GET /etf/{id}
```

### Register an Exchange Traded Fund

Registers a new Exchange Traded Fund based on the provided data.

**Endpoint:**

```http
POST /etf/register
```

### Update an Exchange Traded Fund

Updates details of a specific Exchange Traded Fund based on the provided ID.

**Endpoint:**

```http
PUT /etf/{id}
```

### Delete an Exchange Traded Fund

Deletes a specific Exchange Traded Fund based on the provided ID.

**Endpoint:**

```http
DELETE /etf/{id}
```

### List all investments

Returns a list of all available types of investments.

**Endpoint:**

```http
GET /assets
```

### Register a new investment

Creates a new investment based on the provided data.

**Endpoint:**

```http
POST /assets/register
```

**Responses:**

```http
200: Successful registration
```

### Delete an investment

Deletes a specific investment based on the provided ID.

**Endpoint:**

```http
DELETE /assets/{id}
```

**Responses:**

```http
200: Successful deletion
```

### List all real estate funds

Retrieve all registered real estate funds.

**Endpoint:**

```http
GET /ref
```

### Get a specific real estate fund

Retrieve details of a specific real estate fund based on ID.

**Endpoint:**

```http
GET /ref/{id}
```

### Register a new real estate fund

Register a new real estate fund based on the provided data.

**Endpoint:**

```http
POST /ref/register
```

### Update a specific real estate fund

Update details of a specific real estate fund based on ID.

**Endpoint:**

```http
PUT /ref/{id}
```

### Delete a specific real estate fund

Delete a specific real estate fund based on ID.

**Endpoint:**

```http
DELETE /ref/{id}
```

**Responses:**

```http
200: Successful deletion
```

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

**Request Body:**

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

**Request Body:**

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

### List all assets

Get all assets.

**Endpoint:**

```http
GET /treasury
```

### Get a specific asset

Get details of a specific asset based on the ID.

**Endpoint:**

```http
GET /treasury/{id}
```

### Register an asset

Register a new asset based on the provided data.

**Endpoint:**

```http
POST /treasury/register
```

### Update an asset

Update details of a specific asset based on the ID.

**Endpoint:**

```http
PUT /treasury
```

### Delete an asset

Delete a specific asset based on the ID.

**Endpoint:**

```http
DELETE /treasury/{id}
```

### User system login

Logs in a user based on the provided information.

**Endpoint:**

```http
POST /user/login
```

**Responses:**

```http
200: Successful login
400: User not registered
401: Invalid credentials
```

### User System Registration

Registers a new user based on the provided information.

**Endpoint:**

```http
POST /user/register
```

**Responses:**

```http
200: Successful registration
409: Username already in use
```

### Update user in the system

Updates the information of a specific user based on the provided ID.

**Endpoint:**

```http
PUT /user/{id}
```

**Responses:**

```http
200: Successful update
404: User not found
```

### Delete user in the system

Deletes a specific user based on the provided ID.

**Endpoint:**

```http
DELETE /user/{id}
```

**Responses:**

```http
200: Successful deletion
404: User not found
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

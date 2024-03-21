CREATE TABLE real_estate_investment_funds (
    id VARCHAR(255) PRIMARY KEY UNIQUE NOT NULL,
    name VARCHAR(50) NOT NULL CHECK (LENGTH(name) > 0),
    symbol VARCHAR(10) NOT NULL UNIQUE,
    company_name VARCHAR(255) NOT NULL,
    type VARCHAR(50) NOT NULL,
    amount INTEGER NOT NULL,
    price FLOAT NOT NULL
);
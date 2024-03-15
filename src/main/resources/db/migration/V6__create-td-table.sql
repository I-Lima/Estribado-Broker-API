CREATE TABLE treasury (
    id VARCHAR(255) PRIMARY KEY UNIQUE NOT NULL,
    name VARCHAR(50) NOT NULL CHECK (LENGTH(name) > 0),
    amount INTEGER NOT NULL,
    type VARCHAR(255) NOT NULL,
    maturity_date TIMESTAMP NOT NULL,
    interest_rate FLOAT NOT NULL,
    price FLOAT NOT NULL
);
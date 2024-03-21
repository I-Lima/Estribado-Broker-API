CREATE TABLE users_wallet (
   id VARCHAR(255) PRIMARY KEY UNIQUE NOT NULL,
   user_id VARCHAR(255),
   type_investment_id VARCHAR(255),
   symbol VARCHAR(255),
   amount INTEGER,
   price DOUBLE PRECISION,
   FOREIGN KEY (user_id) REFERENCES users(id),
   FOREIGN KEY (type_investment_id) REFERENCES types_investments(id)
);
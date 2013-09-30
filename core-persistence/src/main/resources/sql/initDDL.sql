DROP SCHEMA IF EXISTS chessapp;
CREATE SCHEMA chessapp;

CREATE TABLE users (
  username VARCHAR(20) PRIMARY KEY,
  password VARCHAR(20),
  enabled  VARCHAR(20)
);
CREATE TABLE authorities (
  username  VARCHAR(20) PRIMARY KEY,
  authority VARCHAR(20)
)



DROP SCHEMA IF EXISTS chessapp;
CREATE SCHEMA chessapp;

DROP TABLE IF EXISTS users;
CREATE TABLE users (
  username VARCHAR(20) PRIMARY KEY,
  password VARCHAR(20),
  enabled  VARCHAR(20)
);

DROP TABLE IF EXISTS authorities;
CREATE TABLE authorities (
  username  VARCHAR(20) PRIMARY KEY,
  authority VARCHAR(20)
);

DROP TABLE IF EXISTS players;
CREATE TABLE players (
  nick_name  VARCHAR(20) PRIMARY KEY,
  first_name VARCHAR(20),
  last_name  VARCHAR(20),
  lang       VARCHAR(10)
);




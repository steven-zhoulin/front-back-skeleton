CREATE TABLE city (
  id int primary key AUTO_INCREMENT,
  name varchar(64) NOT NULL,
  city_id varchar(12) NOT NULL,
  province_id varchar(12) NOT NULL
);

CREATE TABLE province (
  id int primary key AUTO_INCREMENT,
  name varchar(64) NOT NULL,
  province_id varchar(12) NOT NULL
);
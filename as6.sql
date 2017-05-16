# To run it:
# mysql -u root -p < menu.sql
# enter pwd: goodyear123!@#

DROP DATABASE IF EXISTS name_db;
CREATE DATABASE name_db;
USE name_db;

CREATE TABLE _Name(
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(255),
        namelist TEXT
);
INSERT INTO _Name(name) VALUES ("Dr. Evil");
INSERT INTO _Name(name) VALUES ("Mini Me");
INSERT INTO _Name(name) VALUES ("Number Two");
INSERT INTO _Name(name) VALUES ("Austin Power");

CREATE TABLE _Skills(
        id INT AUTO_INCREMENT PRIMARY KEY,
        nid INT,
        skill VARCHAR(255)
);
INSERT INTO _Skills(nid, skill) VALUES (1, "Butcher");
INSERT INTO _Skills(nid, skill) VALUES (1, "Saucier");
INSERT INTO _Skills(nid, skill) VALUES (1, "Baker");

INSERT INTO _Skills(nid, skill) VALUES (2, "Saucier");
INSERT INTO _Skills(nid, skill) VALUES (2, "Baker");

INSERT INTO _Skills(nid, skill) VALUES (3, "Butcher");
INSERT INTO _Skills(nid, skill) VALUES (3, "Dishwasher");

INSERT INTO _Skills(nid, skill) VALUES (4, "Baker");
INSERT INTO _Skills(nid, skill) VALUES (4, "Saucier");

CREATE TABLE _Spots(
    id INT AUTO_INCREMENT PRIMARY KEY,
    _name INT,
    dy VARCHAR(255)
);
INSERT INTO _Spots(_name, dy) VALUES(1, "Monday, Wednesday, Friday");
INSERT INTO _Spots(_name, dy) VALUES(2, "Tuesday, Wednesday, Friday");
INSERT INTO _Spots(_name, dy) VALUES(3, "Monday, Friday");
INSERT INTO _Spots(_name, dy) VALUES(4, "Tuesday, Thursday");

CREATE TABLE Times_Open(
    id INT AUTO_INCREMENT PRIMARY KEY,
    _name INT,
    hours VARCHAR(255)
);

INSERT Times_Open(_name, hours) VALUES(1, "9, 10, 11, 12, 19, 20");
INSERT Times_Open(_name, hours) VALUES(2, "9, 18, 12, 14, 15, 16, 17, 18");
INSERT Times_Open(_name, hours) VALUES(3, "3, 13, 14, 15, 16, 17, 18");
INSERT Times_Open(_name, hours) VALUES(4, "8, 9, 10, 11, 12, 13, 14");
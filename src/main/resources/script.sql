CREATE
DATABASE IF NOT EXISTS air_company;
USE
air_company;
DROP TABLE IF EXISTS flight;
DROP TABLE IF EXISTS airplane;
DROP TABLE IF EXISTS air_company;


CREATE TABLE air_company
(
    id           INT         NOT NULL AUTO_INCREMENT,
    name         VARCHAR(45) NOT NULL,
    company_type VARCHAR(45) NOT NULL,
    founded_at   DATE        NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE airplane
(
    id                    INT            NOT NULL AUTO_INCREMENT,
    name                  VARCHAR(45)    NOT NULL,
    factory_serial_number VARCHAR(45)    NOT NULL,
    number_of_flights     INT            NOT NULL,
    flight_distance       DECIMAL(10, 2) NOT NULL,
    fuel_capacity         INT            NOT NULL,
    type                  VARCHAR(45)    NOT NULL,
    created_at            DATE           NOT NULL,
    air_company_id        INT            NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT air_company_fk
        FOREIGN KEY (air_company_id)
            REFERENCES air_company (id)
);

CREATE TABLE flight
(
    id                    INT            NOT NULL AUTO_INCREMENT,
    flight_status         ENUM('ACTIVE', 'COMPLETED', 'DELAYED', 'PENDING') NOT NULL,
    departure_country     VARCHAR(45)    NOT NULL,
    destination_country   VARCHAR(45)    NOT NULL,
    distance              DECIMAL(10, 2) NOT NULL,
    estimated_flight_time VARCHAR(8)     NOT NULL,
    ended_at              DATETIME DEFAULT NULL,
    delay_started_at      DATETIME DEFAULT NULL,
    created_at            DATETIME       NOT NULL,
    air_company_id        INT            NOT NULL,
    airplane_id           INT            NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT flight_company_fk
        FOREIGN KEY (air_company_id)
            REFERENCES air_company (id),
    CONSTRAINT flight_airplane_fk
        FOREIGN KEY (airplane_id)
            REFERENCES airplane (id)
);
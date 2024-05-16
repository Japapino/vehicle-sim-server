create table if not exists vehicles (
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    vehicle_make varchar(255),
    vehicle_model varchar(255),
    vehicle_year varchar(255),
    body_style varchar array[255]
);
create table if not exists vehicles (
    vehicle_year varchar(255),
    vehicle_make varchar(255),
    vehicle_model varchar(255),
    body_styles varchar array[255]
) as 
select *
from csvread('data/vehicle_data.csv', null, 'charset=UTF-8');

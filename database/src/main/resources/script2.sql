create table weather(
id int not null auto_increment primary key,
city varchar(100),
temp float,
pressure float,
time timestamp
)

select * from weather;
insert into weather (city,temp,pressure,time) values ('London',280.5, 1024,now());
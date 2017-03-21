#hello
create database weather;

create user 'admin'@'localhost' identified by 'haslo';

grant all on weather.* to 'admin'@'localhost';



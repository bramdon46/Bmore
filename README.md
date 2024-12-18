# Bmore
Code challenge

To run this project you need to put your credentials in the properties
spring.datasource.username=
spring.datasource.password=

To have DB its necessary to run this queries
create database demo;
create table demo.users(
	user_id bigint PRIMARY KEY NOT NULL auto_increment,
    user_name varchar(255) not null,
    user_password varchar(255) not null
);
create table demo.tasks(
	task_id bigint PRIMARY KEY NOT NULL auto_increment,
    task_title varchar(255) not null,
    task_description varchar(255) not null,
    task_state varchar(255) not null
);

To run the project on intelij use this command in your maven configurations
clean install spring-boot:run -DskipTests

To call endpoints you can use swagger or postman

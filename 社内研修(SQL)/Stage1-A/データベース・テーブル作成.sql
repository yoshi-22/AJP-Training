CREATE DATABASE TASK_DB;
USE TASK_DB;
CREATE TABLE T_USER(
	USER_ID varchar(12) not null primary key,
    USER_NM varchar(10) not null,
    PASSWORD varchar(8) not null,
    OFFICE_CD varchar(4) not null,
    BIRTHDAY datetime,
    SENIORITY int,
    DELET_FLG varchar(1) not null default "0"
);
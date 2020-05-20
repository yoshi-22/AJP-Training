CREATE DATABASE TASK_DB;
USE TASK_DB;
CREATE TABLE T_USER(
	USER_ID varchar(12),
    USER_NM varchar(10),
    PASSWORD varchar(8),
    OFFICE_CD varchar(4),
    BIRTHDAY datetime,
    SENIORITY int,
    DELET_FLG varchar(1)
);
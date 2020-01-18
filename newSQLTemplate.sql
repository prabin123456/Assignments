/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  basta
 * Created: Jan 18, 2020
 */

create database office;
use office;

create table employee(
	id int, 
    name varchar(30),
    salary long, 
    deptId varchar(30),
    managerId int,
    primary key (id)
    );
    
insert into employee values
	(300, 'Prabin', 30000, 'IT', 11),
    (301, 'Harshit' , 40000, 'HR', 11),
    (302, 'Danny', 50000, 'Sales', 11),
    (303, 'Solti', 60000, 'IT', 11);
    
create table Manager(
	id int, 
    Fname varchar(30),
    primary key(id)
    );
    
insert into Manager values
	(11, "Danny"),
    (10, "Hari");
    
CREATE TABLE department (
  departmentid varchar(30) NOT NULL,
  departmentname VARCHAR(45) NULL,
  PRIMARY KEY (`departmentid`));
    
insert into department values
	( 'IT', 'Engineering and Computer Science'),
    ('HR', 'Human Resources');
    
    
/*Queries*/

select * from employee
	order by salary;

/*finding average salary*/
select avg(salary) from  employee; 

select * from employee where 
	employee.salary < (select avg(salary) from employee);
    
select salary- (select avg(salary) from employee) from employee;

select min(abs(salary- (select avg(salary) from employee))) from employee;

/*This is not working Q: FInd the closest to average*/
select * from employee 
	where ((select salary- (select avg(salary) from employee) from employee) ) = 
    (select min(abs(salary- (select avg(salary) from employee))) from employee LIMIT 1 ) ;
 
 /*Find max salary in a department*/
select deptId, max(salary) from employee
where deptId = 'IT'
group by deptId;  
    

/*question from whatsapp*/
select distinct(salary) from employee
	order by salary 
    limit 1 offset 2;

/*Write down the definitions of ACID.
Atomicity: Entire transaction takes place at once or does not happen at all. 
Consistency: Database must be consistent before and after the transaction. 
Isolation: Multiple transactions occur independently without interferences. 
Durability: The change of the transaction occurs even if the system fails. 
*/




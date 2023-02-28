use hr;

-- 01
select first_name as "First Name", last_name as "Last Name" 
from employees;

-- 02
select distinct department_id 
from employees;

-- 03
SELECT * FROM employees
ORDER BY first_name desc;

-- 04
select employee_id, concat(first_name, " ", last_name) as Name, salary 
from employees 
order by salary;

-- 05
select sum(salary) as Payable
from employees;  

-- 06
select max(salary) as max, min(salary) as min
from employees;

-- 07
select avg(salary), count(*)
from employees;

-- 08
select count(distinct job_id) as "Available Jobs" 
from employees;

-- 09
select upper(first_name)
from employees;

-- 10
select *
from employees
limit 10;

-- 11
select *
from employees
limit 2, 2;

-- 12
select *
from employees
order by employee_id desc
limit 1, 1;
-- 01
select employee_id, first_name, salary
from employees
where salary < 3000;

-- 02
select first_name, last_name
from employees
where FIRST_NAME like "a%";

-- 03
select employee_id, job_id, department_id
from employees
where job_id = "PU_CLERK" or manager_id = 114;

-- 04
select employee_id, first_name, salary
from employees
where SALARY between 1500 and 3000;

-- 05
select employee_id, first_name, salary
from employees
where COMMISSION_PCT is null;

-- 06
select first_name
from employees
where first_name like "%n";

-- 07
select employee_id, job_id, department_id
from employees
where JOB_ID <> "PU_CLERK";

-- 08
select employee_id, first_name, salary
from employees
where salary not in (3300, 3200, 2200);

-- 09
select concat(first_name, " ", last_name) as Name
from employees
where first_name like "a%n"; 

-- 10
select concat(first_name, " ", last_name) as name
from employees
where concat(first_name, " ", last_name) like "%la%";

-- 11
select employee_id, first_name, salary
from employees
order by SALARY desc;

-- 12
select first_name
from employees
where FIRST_NAME like "_a%";

-- 13
select employee_id, first_name, salary
from employees
where SALARY not between 1500 and 3000;

-- 14
select department_id, first_name, last_name
from employees
where DEPARTMENT_ID in (30, 100)
order by DEPARTMENT_ID;

-- 15
select first_name, last_name, salary
from employees
where salary not between 10000 and 15000 and DEPARTMENT_ID in (30, 100);

-- 16
select first_name, last_name, hire_date
from employees
where HIRE_DATE like "1987-%";

-- 17
select last_name
from employees
where LAST_NAME like "______";

-- 18
select first_name, salary, 0.15 * salary as PF
from employees;

-- 19
select first_name, salary, commission_pct * salary as "commission rate"
from employees;

-- 20
select first_name, salary, salary - 500 as "NET Salary"
from employees;
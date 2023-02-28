-- 01
SELECT 
    e.first_name,
    e.last_name,
    e.department_id,
    d.department_name
FROM
    employees e
        INNER JOIN
    departments d ON e.DEPARTMENT_ID = d.DEPARTMENT_ID;
    
-- 02
select
	e.first_name,
    e.last_name,
    e.job_id,
    e.department_id,
    d.department_name
from employees e, departments d, locations l
where e.DEPARTMENT_ID = d.DEPARTMENT_ID and d.LOCATION_ID = l.LOCATION_ID and l.CITY = "London";

-- 03
select e.FIRST_NAME, e.LAST_NAME, d.DEPARTMENT_NAME, l.CITY, l.STATE_PROVINCE
from employees e, departments d, locations l
where e.DEPARTMENT_ID = d.DEPARTMENT_ID and d.LOCATION_ID = l.LOCATION_ID;

-- 04
select e.EMPLOYEE_ID, e.LAST_NAME as employee, e.MANAGER_ID, m.LAST_NAME as manager
from employees e, employees m
where e.MANAGER_ID = m.EMPLOYEE_ID;

-- 05
select e.FIRST_NAME, e.LAST_NAME, e.HIRE_DATE
from employees e, employees j
where j.LAST_NAME = "Jones" and datediff(e.hire_date, j.hire_date) > 1;

-- 06
select d.DEPARTMENT_NAME, count(EMPLOYEE_ID)
from employees e inner join departments d using(department_id)
group by e.DEPARTMENT_ID;

-- 07
select d.DEPARTMENT_ID, d.DEPARTMENT_NAME, e.EMPLOYEE_ID, e.FIRST_NAME
from departments d, employees e
where d.DEPARTMENT_ID = e.DEPARTMENT_ID and d.MANAGER_ID = e.EMPLOYEE_ID;

-- 08
select d.DEPARTMENT_NAME, e.LAST_NAME, l.CITY
from departments d, employees e, locations l
where d.MANAGER_ID = e.EMPLOYEE_ID and d.LOCATION_ID = l.LOCATION_ID;

-- 09
select h.EMPLOYEE_ID, h.START_DATE, h.END_DATE, h.JOB_ID, h.DEPARTMENT_ID
from job_history h
inner join employees e 
on e.EMPLOYEE_ID = h.EMPLOYEE_ID
where e.SALARY > 10000;

-- 10
select m.FIRST_NAME, m.LAST_NAME, m.HIRE_DATE, m.SALARY
from departments d, employees m
where d.MANAGER_ID = m.EMPLOYEE_ID and year(current_date()) - year(m.hire_date) > 15;

-- 11
select d.DEPARTMENT_NAME, avg(SALARY), count(e.EMPLOYEE_ID)
from departments d, employees e
where d.DEPARTMENT_ID = e.DEPARTMENT_ID and COMMISSION_PCT is not null
group by e.DEPARTMENT_ID;

-- 12
select c.COUNTRY_NAME, l.CITY, d.DEPARTMENT_NAME
from departments d, locations l, countries c
where d.LOCATION_ID  = l.LOCATION_ID and l.COUNTRY_ID = c.COUNTRY_ID;

-- 13
select d.DEPARTMENT_NAME, concat(e.FIRST_NAME, " ", e.LAST_NAME) as manager
from departments d, employees e
where d.MANAGER_ID = e.EMPLOYEE_ID;

-- 14
select *
from employees e, job_history j
where e.SALARY >= 12000 and j.EMPLOYEE_ID = e.EMPLOYEE_ID;

-- 15
select concat(e.FIRST_NAME, " ", e.LAST_NAME) as name, e.SALARY
from employees e, departments d, locations l
where e.DEPARTMENT_ID = d.DEPARTMENT_ID and d.LOCATION_ID = l.LOCATION_ID and l.CITY = "London";

-- 16
select j.JOB_TITLE, e.FIRST_NAME, e.SALARY - j.MIN_SALARY as diff
from employees e, jobs j
where e.JOB_ID = j.JOB_ID;

-- 17
select j.JOB_TITLE, avg(e.SALARY)
from employees e, jobs j
where e.JOB_ID = j.JOB_ID
group by e.JOB_ID;

-- 18
select h.EMPLOYEE_ID, j.JOB_TITLE, datediff(h.END_DATE, h.START_DATE)
from job_history h, jobs j
where h.JOB_ID = j.JOB_ID and h.DEPARTMENT_ID = 90;
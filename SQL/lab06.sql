use hr;
-- 01
SELECT 
    *
FROM
    employees e
WHERE
    (SELECT 
            COUNT(j.employee_id)
        FROM
            job_history j
        WHERE
            j.employee_id = e.employee_id) > 0;

-- 02
SELECT 
    first_name, last_name, salary
FROM
    employees
WHERE
    salary > (SELECT 
            salary
        FROM
            employees
        WHERE
            last_name = 'Bull');

-- 03
SELECT 
    first_name, last_name
FROM
    employees
WHERE
    department_id = (SELECT 
            department_id
        FROM
            departments
        WHERE
            department_name = 'IT'
        LIMIT 1);

-- 04
SELECT 
    e.FIRST_NAME, e.LAST_NAME
FROM
    employees e
WHERE
    e.MANAGER_ID IS NOT NULL
        AND e.DEPARTMENT_ID = (SELECT 
            department_id
        FROM
            departments d
        WHERE
            d.LOCATION_ID = (SELECT 
                    location_id
                FROM
                    locations
                WHERE
                    country_id = (SELECT 
                            country_id
                        FROM
                            countries
                        WHERE
                            country_name = 'United States of America' limit 1) limit 1));
    
-- 05
select first_name, last_name
from employees
where employee_id in (select distinct manager_id from departments);

-- 06
select first_name, last_name, salary
from employees
where salary > (select avg(salary) from employees);

-- 07
select first_name, last_name, salary 
from employees e
where salary = (select min_salary from jobs where e.job_id = job_id);

-- 08
select first_name, last_name, salary
from employees
where salary > (select avg(salary) from employees) and
	department_id = any (select department_id from departments where department_name like "IT%");
    
-- 09
select first_name, last_name, salary from employees 
where salary > (select salary from employees where last_name = "Bell");

-- 10
select first_name, last_name, salary
from employees e
where salary = (select min(mins.sal) from (select min(salary) as sal from employees group by department_id) as mins);

-- 11
select first_name, last_name, salary 
from employees
where salary > all (select avg(salary) from employees group by department_id);

-- 12
select first_name, last_name, salary 
from employees
where salary > all (select salary from employees where job_id = "SH_CLERK")
order by salary;



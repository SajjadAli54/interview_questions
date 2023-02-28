-- 01
SELECT 
    COUNT(employee_id)
FROM
    employees
GROUP BY DEPARTMENT_ID;

-- 02
SELECT 
    department_id, COUNT(EMPLOYEE_ID)
FROM
    employees
GROUP BY DEPARTMENT_ID
HAVING COUNT(EMPLOYEE_ID) >= 5;

-- 03
SELECT 
    *
FROM
    employees
WHERE
    first_name IN (SELECT DISTINCT
            first_name
        FROM
            employees);

-- 04
SELECT 
    first_name
FROM
    employees
WHERE
    first_name REGEXP '^[A-Za-z]{3}[A-Za-z]$';

-- 05
SELECT 
    CONCAT(first_name, ' ', last_name) AS name
FROM
    employees
WHERE
    CONCAT(first_name, ' ', last_name) REGEXP 'LA';

-- 06
SELECT 
    CONCAT(first_name, ' ', last_name) AS name
FROM
    employees
WHERE
    FIRST_NAME REGEXP '^A[a-z]*n$';

-- 07
SELECT 
    first_name
FROM
    employees
WHERE
    FIRST_NAME REGEXP '^[A-Za-z]*n$';

-- 08
SELECT 
    first_name, last_name
FROM
    employees
WHERE
    first_name REGEXP '^A';

-- 09
SELECT 
    job_id, COUNT(employee_id)
FROM
    employees
GROUP BY job_id;

-- 10
SELECT 
    manager_id, MIN(salary)
FROM
    employees
WHERE
    MANAGER_ID IS NOT NULL
GROUP BY MANAGER_ID
HAVING MIN(salary) != 2000
ORDER BY MIN(SALARY) DESC;

-- 11
select count(EMPLOYEE_ID)
from employees
where COMMISSION_PCT is null;

-- 12
select first_name, last_name 
from employees
where FIRST_NAME regexp "t";
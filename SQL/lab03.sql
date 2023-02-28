use hr;
-- 01
SELECT 
    CONCAT(LEFT(first_name, 3), RIGHT(last_name, 3)) AS 'New Name'
FROM
    employees;

-- 02
SELECT 
    job_id, REPLACE(job_id, 'E', 'A') AS 'New Jobs'
FROM
    employees
WHERE
    INSTR(job_id, 'E');

-- 03
SELECT 
    CONCAT(first_name, ' ', last_name) AS name, hire_date
FROM
    employees;

-- 04
SELECT 
    CONCAT(first_name, ' ', last_name) AS name,
    DATE_FORMAT(hire_date, '%M %d, %Y') AS 'Hire date'
FROM
    employees
WHERE
    DATE_FORMAT(hire_date, '%M %d, %Y') = 'July 30, 1987';

-- 05
SELECT 
    ADDDATE(ADDDATE(ADDDATE(CURRENT_DATE(),
                INTERVAL - DAY(CURRENT_DATE()) + 1 DAY),
            INTERVAL 1 MONTH),
        INTERVAL - 1 DAY) AS 'Last Date',
    DAYNAME(ADDDATE(ADDDATE(ADDDATE(CURRENT_DATE(),
                        INTERVAL - DAY(CURRENT_DATE()) + 1 DAY),
                    INTERVAL 1 MONTH),
                INTERVAL - 1 DAY)) AS 'Last Day';

-- 06
SELECT DAYNAME(CURRENT_DATE());

-- 07
SELECT 
    DATE_FORMAT(hire_date, '%M %d, %Y')
FROM
    employees;

-- 08
SELECT 
    CONCAT(DAYNAME(CURRENT_DATE()),
            ' ',
            MONTHNAME(CURRENT_DATE()),
            ' ',
            YEAR(CURRENT_DATE())) AS Today;

-- 09
SELECT 
    first_name, hire_date
FROM
    employees
WHERE
    hire_date BETWEEN '1987-06-01' AND '1987-07-31';
    
-- 10
SELECT DATE_FORMAT(CURRENT_DATE(), '%d/%m/%Y') AS Today;

-- 11
SELECT 
    first_name, hire_date
FROM
    employees
WHERE
    MONTHNAME(hire_date) = 'June';

-- 12
SELECT 
    CONCAT(email, '@iba-suk.edu.pk') AS email
FROM
    employees;

-- 13
SELECT 
    employee_id, first_name, MID(hire_date, 6, 2)
FROM
    employees;

-- 14
SELECT 
    RIGHT(phone_number, 4)
FROM
    employees;

-- 15
select reverse(left(reverse(street_address), instr(reverse(street_address), " ")))
from locations;

-- 16
select *
from locations
order by length(street_address)
limit 1; 

-- 17
select left(job_title, instr(job_title, " "))
from jobs
where instr(job_title, " ") != 0;

-- 18
select length(first_name)
from employees
where instr(substr(first_name, 2, length(first_name)-1), "C");
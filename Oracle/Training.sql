ALTER USER SYSTEM IDENTIFIED BY system;
ALTER SESSION SET "_ORACLE_SCRIPT"=true;
CREATE USER mindgate_chennai IDENTIFIED BY mindgate_chennai;
GRANT CONNECT,DBA TO mindgate_chennai;
-- DAY 1
-- DDL DATA DEFINATION LANGUAGE - Completed
    -- 1. CREATE 
    -- 2. ALTER
    -- 3. DROP
-- DML DATA MANIPULATION LANGUAGE - Completed
    -- 1. INSERT
    -- 2. UPDATE
    -- 3. DELETE 
-- CONSTRAINTS
    -- 1. PRIMARY KEY 
    -- 2. FOREIGN KEY
    -- 3. UNIQUE 
    -- 4. NOT NULL
    -- 5. CHECK
    -- 6. DEFAULT
-- QUERY - Completed
    -- 1. SELECT
    -- 2. CONDTION - WHERE , AND, OR , NOT 
    -- 3. LIKE , DISTINCT 
    -- 4. AGG FUNCTIONS
    -- 5. ORDER BY ,GROUP BY , HAVING
    
 -- Employee
 CREATE TABLE employee_details(
    employee_id VARCHAR2(50),
    name VARCHAR2(50),
    salary NUMBER(10,2),
    date_of_birth DATE,
    department VARCHAR2(50),
    gender VARCHAR2(6),
    state VARCHAR2(50),
    email_id VARCHAR2(50)
 );
 -- Male , Female
 --  IT , TRAINING , DEVELOPMENT , HR 
TRUNCATE TABLE employee_details;


INSERT INTO employee_details 
VALUES ('MGS5233','Balavignesh',80000,'29-JULY-2004','TRAINING','Male','Tamil Nadu','balavignesh.m@mindgate.in');
INSERT INTO employee_details 
VALUES ('MGS5237','Jayesh',45000,'20-AUG-2002','IT','Male','Rajasthan','jay2002@gmail.com');
INSERT INTO employee_details 
VALUES('MGS5230','Ajay',500000,'07-JULY-2025','DEVELOPMENT','Male','Tamil Nadu','ajay123@gmail.com');
INSERT INTO employee_details
VALUES('MGS5234','Devak',10000,'05-AUG-2004','TRAINING','Male','Andhra Pradesh','chilaka.devak@mindgate.in');
INSERT INTO employee_details 
VALUES ('MGS5236','Himanshu',75000,'22-DECEMBER-2002','DEVELOPMENT','Male','Bihar','himanshu.kumar@mindgate.in');
INSERT INTO employee_details 
VALUES ('MGS5243', 'Selvakumar', 30000, '24-JULY-2003','DEVELOPMENT', 'Male','Tamil Nadu','selvakumar.r@mindgate.in');
INSERT INTO employee_details 
VALUES('MGS5242','Sadhan Kumar',40000,'01-JULY-2003','DEVELOPMENT','Male','Tamil Nadu','sadhankumar.s@mindgate.in');
INSERT INTO employee_details 
VALUES('MGS5231','Aridaman',8000,'29-JULY-2001','DEVELOPMENT','Male','Delhi','aridaman.singh@mindgate.in');
INSERT INTO employee_details
VALUES ('MGS5235', 'Guna Sekhar Sai', 50000, '03-NOVEMBER-2003' , 'TRAINING', 'Male', 'Andhra Pradesh', 'gunasekhar.sai@mindgate.in');
INSERT INTO EMPLOYEE_DETAILS 
VALUES ('MGS5246','Vishwa',20000,'30-AUGUST-2004','IT','Male','Tamil Nadu','srivishwa.p@mindgate.in');
INSERT INTO employee_details 
VALUES('MGS5247','Thejeswni',100000,'23-SEPTEMBER-2002','DEVELOPMENT','Female','Tamil Nadu','thejeswni.m@mindgate.in');
INSERT INTO Employee_details 
VALUES('MGS5238','Jayshri raman',10000,'07-MAR-2003','DEVELOPMENT','Female','Tamil Nadu','jayshri.raman@mindgate.com');
INSERT INTO Employee_details  
VALUES ('MGS5241','Mithra',60000,'11-JANUARY-2004','DEVELOPMENT','Female','Tamil Nadu','mithra.y@mindgate.in');
INSERT INTO employee_details 
VALUES('MGS5245','Sobiya',30000,'18-JULY-2003','TRAINING','Female','Tamil Nadu','sobiya.anandhan@mindgate.in');
Insert into employee_details
VALUES('MGS5239','Kavithalaya',80000,'29-AUGUST-2004','DEVELOPMENT','Female','Tamil Nadu','kavithalaya.v@mindgate.in');
INSERT INTO employee_details 
VALUES ('MGS5228','Abinash', 100000.00, '27-Feb-2004','DEVELOPMENT','Male','Tamil Nadu','abinash.s@mindgate.in');
INSERT INTO employee_details 
VALUES ('MGS5229','Manikanta',50000,'01-JULY-2003','DEVELOPMENT','Male','Telangana','manikanta.aeruvaka@mindgate.in');
INSERT INTO EMPLOYEE_DETAILS 
VALUES ('MGS5240' , 'Mohan' ,30000, '27-May-2004' , 'TRAINING' , 'Male','Tamil Nadu', 'mohanaselvan.mk@mindgate.in');
INSERT INTO EMPLOYEE_DETAILS
VALUES('MGS5244','senoj',40000,'19-MAY-2003','IT','Male','Tamil Nadu','senoj.s@mindgate.in');
INSERT INTO employee_details 
VALUES ('MGS5232', 'Astik Raj', 80000, '21-OCTOBER-2002', 'TRAINING', 'Male', 'Tamil Nadu', 'astik.raj@mindgate.in');

-- print all rows and columns
SELECT * FROM employee_details;
-- print selected columns but all rows 
SELECT employee_id,name,salary,department FROM employee_details;
-- print employees working in IT department
SELECT * FROM employee_details WHERE department='IT';
-- print employees working in development department
SELECT * FROM employee_details WHERE department='DEVELOPMENT';
-- print female employees working in development department
SELECT * FROM employee_details WHERE department='DEVELOPMENT' AND gender='Female';    
-- print male employees working in development department who are from Tamil Nadu    
SELECT * FROM employee_details WHERE department='DEVELOPMENT' AND gender='Male' AND state='Tamil Nadu';  
-- print employees who are from Andhra Pradesh,Rajasthan,Delhi,Bihar,Telangana
SELECT * FROM employee_details WHERE state='Andhra Pradesh' OR state='Telangana' OR state='Rajasthan' OR state='Bihar' OR state='Delhi';
SELECT * FROM employee_details WHERE state IN('Andhra Pradesh','Rajasthan','Delhi','Bihar','Telangana');
-- print all unique states from table
SELECT DISTINCT state FROM employee_details;
-- print all employees details in asc order of salary     
SELECT * FROM employee_details ORDER BY salary;
-- print all employees details in asc order of name
SELECT * FROM employee_details ORDER BY name;
-- print only employee id , name , state ,gender of employees in asc order of state and name
SELECT employee_id,name,state,gender FROM employee_details order by state asc , name desc ;
-- print total salary  of employee who lives in Tamil Nadu
SELECT SUM(salary) FROM employee_details WHERE state='Tamil Nadu';
-- print total count of male and total count of female employees
SELECT COUNT(gender) FROM employee_details WHERE gender = 'Male';
SELECT COUNT(gender) FROM employee_details WHERE gender = 'Female';
-- Using Group By
SELECT COUNT(gender) , gender FROM employee_details GROUP BY gender;
-- Print count of employee from each state
SELECT COUNT(state),state FROM employee_details GROUP BY state ORDER BY COUNT(state);
SELECT COUNT(state),state FROM employee_details GROUP BY state ORDER BY COUNT(state);
SELECT COUNT(state),state FROM employee_details GROUP BY state ORDER BY COUNT(state) DESC;
-- Print count and avg salary of employees from each state
SELECT COUNT(state),AVG(salary), state FROM employee_details GROUP BY state ORDER BY AVG(salary);
-- Print count and avg salary of employees from each state only if the avg salary is >= 50000  
SELECT 
    COUNT(state) STATE_COUNT, AVG(salary) AVG_SALARY, state 
FROM employee_details 
GROUP BY state 
HAVING AVG(salary) >= 50000
ORDER BY AVG_SALARY;

-- Print count and avg salary of male employees from each state only if the avg salary is >= 50000  
SELECT 
    COUNT(state) STATE_COUNT, AVG(salary) AVG_SALARY, state 
FROM employee_details 
WHERE gender = 'Male'
GROUP BY state 
HAVING AVG(salary) >= 50000
ORDER BY AVG_SALARY;

SELECT * FROM employee_details;    
-- print employees name ending with 'sh'
SELECT * FROM employee_details WHERE name LIKE '%sh';

-- print all employeee accept from IT department
SELECT * FROM employee_details WHERE department != 'IT';
SELECT * FROM employee_details WHERE department NOT IN ('IT');
    
 -- ALTER
 -- ADD COLUMN
ALTER TABLE employee_details
ADD age NUMBER(3);

DESC employee_details; 
SELECT * FROM employee_details;

 -- DELETE COLUMN
ALTER TABLE employee_details
DROP COLUMN age;

-- MODIFY COLUMN
ALTER TABLE employee_details
MODIFY name VARCHAR2(60);
    
DESC employee_details;
SELECT * FROM employee_details;

-- RENAME COLUMN
ALTER TABLE employee_details
RENAME COLUMN name TO full_name;

DESC employee_details;

-- RENAME TABLE
ALTER TABLE employee_details RENAME TO employees;
DESC employees;    

ALTER TABLE employees RENAME TO employee_details; 
DESC employee_details;
    
    
-- DROP TABLE 
DROP TABLE employee_details;
DESC employee_details;

-- INSERT
 -- Employee
 CREATE TABLE employee_details(
    employee_id VARCHAR2(50),
    name VARCHAR2(50),
    salary NUMBER(10,2),
    date_of_birth DATE,
    department VARCHAR2(50),
    gender VARCHAR2(6),
    state VARCHAR2(50),
    email_id VARCHAR2(50)
 );
 
INSERT INTO employee_details(employee_id,salary,department,gender)
VALUES ('MGS5233',80000,'TRAINING','Male');

SELECT * FROM employee_details;

-- UPDATE
UPDATE employee_details SET name = 'Balavignesh' WHERE employee_id='MGS5233';

--DELETE
DELETE FROM employee_details WHERE employee_id='MGS5233';

-- CONSTRAINTS
    -- 1. PRIMARY KEY 
DROP TABLE employee_details;
CREATE TABLE employee_details(
    employee_id VARCHAR2(50),
    name VARCHAR2(50),
    salary NUMBER(10,2),
    date_of_birth DATE,
    department VARCHAR2(50),
    gender VARCHAR2(6),
    state VARCHAR2(50),
    email_id VARCHAR2(50),
    CONSTRAINT employee_id_pk PRIMARY KEY(employee_id)
);
INSERT INTO employee_details 
VALUES ('MGS5233','Balavignesh',80000,'29-JULY-2004','TRAINING','Male','Tamil Nadu','balavignesh.m@mindgate.in');

SELECT * FROM user_constraints;
DROP TABLE employee_details;
CREATE TABLE employee_details(
    employee_id VARCHAR2(50),
    name VARCHAR2(50),
    salary NUMBER(10,2),
    date_of_birth DATE,
    department VARCHAR2(50),
    gender VARCHAR2(6),
    state VARCHAR2(50),
    email_id VARCHAR2(50),
    CONSTRAINT employee_id_pk PRIMARY KEY(employee_id,email_id)
);
INSERT INTO employee_details 
VALUES ('MGS5233','Balavignesh',80000,'29-JULY-2004','TRAINING','Male','Tamil Nadu','balavignesh.m@mindgate.in');
INSERT INTO employee_details 
VALUES ('MGS5233','Balavignesh',80000,'29-JULY-2004','TRAINING','Male','Tamil Nadu','balavignesh@mindgate.in');

-- FOREIGN KEY
CREATE TABLE department_details(
    department_id  VARCHAR2(10),
    department_name VARCHAR(50),
    CONSTRAINT department_id_pk PRIMARY KEY(department_id)
);
INSERT INTO department_details VALUES('D101','HR');
INSERT INTO department_details VALUES('D102','IT');
INSERT INTO department_details VALUES('D103','TRAINING');
INSERT INTO department_details VALUES('D104','DEVELOPMENT');

SELECT * FROM department_details;
DROP TABLE employee_details;
-- CONSTRAINTS
    -- 1. PRIMARY KEY 
    -- 2. FOREIGN KEY
    -- 3. UNIQUE 
    -- 4. NOT NULL
    -- 5. CHECK
    -- 6. DEFAULT
CREATE TABLE employee_details(
    employee_id VARCHAR2(50),
    name VARCHAR2(50) NOT NULL,
    salary NUMBER(10,2) NOT NULL,
    date_of_birth DATE NOT NULL,
    department_id VARCHAR2(50),
    gender VARCHAR2(6) NOT NULL,
    state VARCHAR2(50) DEFAULT 'Tamil Nadu',
    email_id VARCHAR2(50) NOT NULL,
    CONSTRAINT employee_id_pk PRIMARY KEY(employee_id),
    CONSTRAINT department_id_fk FOREIGN KEY(department_id) REFERENCES department_details(department_id),
    CONSTRAINT email_id_uq UNIQUE(email_id),
    CONSTRAINT gender_ck CHECK (gender IN ('Male','Female'))
);

INSERT INTO employee_details 
VALUES ('MGS5233','Balavignesh',80000,'29-JULY-2004','D103','Male','Tamil Nadu','balavignesh.m@mindgate.in');
INSERT INTO employee_details 
VALUES ('MGS5237','Jayesh',45000,'20-AUG-2002','D103','Male',DEFAULT,'jay2002@gmail.com');

INSERT INTO employee_details(employee_id,name,salary,date_of_birth,gender,email_id)
VALUES ('MGS5232', 'Astik Raj', 80000, '21-OCTOBER-2002', 'Male', 'astik.raj@mindgate.in');

SELECTY


DESC employee_details;
SELECT * FROM employee_details;
    
 -- SQL Day 2
 -- Joins , Subqueries
 -- Index
 -- Views
 -- Stored Procedures
 -- Triggers
 
 -- Joins
 -- 1. Inner Join
 -- 2. Outer Join
    -- a. Left Join
    -- b. Right Join
    -- c. Full Join
-- 3. Cross Join
-- 4. Self Join

   
CREATE TABLE candidate(
    candidate_id NUMBER(5),
    name VARCHAR2(25)
);
INSERT INTO candidate VALUES(1,'Jayesh');
INSERT INTO candidate VALUES(2,'Ajay');
INSERT INTO candidate VALUES(3,'Devak');
INSERT INTO candidate VALUES(4,'Himanshu');
INSERT INTO candidate VALUES(5,'Astik');

CREATE TABLE employee(
    employee_id NUMBER(5),
    name VARCHAR2(25)
);

INSERT INTO employee VALUES(101,'Jayesh');   
INSERT INTO employee VALUES(102,'Ajay');   
INSERT INTO employee VALUES(103,'Balavignesh');   
INSERT INTO employee VALUES(104,'Himanshu');  
INSERT INTO employee VALUES(105,'Srivishwa');  
TRUNCATE TABLE employee;
Update employee set name='Balavignesh' WHERE employee_id = 103;
SELECT * FROM candidate;
SELECT * FROM employee;   
   
-- Cross Join
SELECT * FROM candidate CROSS JOIN employee;
-- Inner Join
SELECT * FROM candidate c  INNER JOIN employee e ON c.name = e.name;
-- Left Outer Join
SELECT * FROM candidate c LEFT OUTER JOIN employee e ON c.name = e.name;
-- Right Outer Join
SELECT * FROM candidate c RIGHT OUTER JOIN employee e ON c.name = e.name;
-- Full Outer Join
SELECT * FROM candidate c FULL OUTER JOIN employee e ON c.name = e.name;
   
--Self Join
DROP TABLE employee;
CREATE TABLE employee(
    employee_id NUMBER(5),
    name VARCHAR2(50),
    manager_id NUMBER(5)
);
INSERT INTO employee VALUES(1,'Manikanta',NULL);
INSERT INTO employee VALUES(2,'Abhinash',1);
INSERT INTO employee VALUES(3,'Kavithalaya',1);
INSERT INTO employee VALUES(4,'Sobiya',2);
INSERT INTO employee VALUES(5,'Mithra',3);
SELECT * FROM employee;

SELECT * FROM employee e CROSS JOIN employee m;
   
SELECT * FROM employee e INNER JOIN employee m ON e.manager_Id = m.employee_Id; 
  
SELECT e.name , 'Reports To ' , m.name FROM employee e INNER JOIN employee m ON e.manager_Id = m.employee_Id; 

SELECT * FROM employee_details;
SELECT * FROM department_details;   

TRUNCATE TABLE employee_details;
INSERT INTO employee_details 
VALUES ('MGS5233','Balavignesh',80000,'29-JULY-2004','D103','Male','Tamil Nadu','balavignesh.m@mindgate.in');
INSERT INTO employee_details 
VALUES ('MGS5237','Jayesh',45000,'20-AUG-2002','D102','Male','Rajasthan','jay2002@gmail.com');
INSERT INTO employee_details 
VALUES('MGS5230','Ajay',500000,'07-JULY-2025','D104','Male','Tamil Nadu','ajay123@gmail.com');
INSERT INTO employee_details
VALUES('MGS5234','Devak',10000,'05-AUG-2004','D103','Male','Andhra Pradesh','chilaka.devak@mindgate.in');
INSERT INTO employee_details 
VALUES ('MGS5236','Himanshu',75000,'22-DECEMBER-2002','D104','Male','Bihar','himanshu.kumar@mindgate.in');
INSERT INTO employee_details 
VALUES ('MGS5243', 'Selvakumar', 30000, '24-JULY-2003','D104', 'Male','Tamil Nadu','selvakumar.r@mindgate.in');
INSERT INTO employee_details 
VALUES('MGS5242','Sadhan Kumar',40000,'01-JULY-2003','D104','Male','Tamil Nadu','sadhankumar.s@mindgate.in');
INSERT INTO employee_details 
VALUES('MGS5231','Aridaman',8000,'29-JULY-2001','D104','Male','Delhi','aridaman.singh@mindgate.in');
INSERT INTO employee_details
VALUES ('MGS5235', 'Guna Sekhar Sai', 50000, '03-NOVEMBER-2003' , 'D103', 'Male', 'Andhra Pradesh', 'gunasekhar.sai@mindgate.in');
INSERT INTO EMPLOYEE_DETAILS 
VALUES ('MGS5246','Vishwa',20000,'30-AUGUST-2004','D102','Male','Tamil Nadu','srivishwa.p@mindgate.in');
INSERT INTO employee_details 
VALUES('MGS5247','Thejeswni',100000,'23-SEPTEMBER-2002','D104','Female','Tamil Nadu','thejeswni.m@mindgate.in');
INSERT INTO Employee_details 
VALUES('MGS5238','Jayshri raman',10000,'07-MAR-2003','D104','Female','Tamil Nadu','jayshri.raman@mindgate.com');
INSERT INTO Employee_details  
VALUES ('MGS5241','Mithra',60000,'11-JANUARY-2004','D104','Female','Tamil Nadu','mithra.y@mindgate.in');
INSERT INTO employee_details 
VALUES('MGS5245','Sobiya',30000,'18-JULY-2003','D103','Female','Tamil Nadu','sobiya.anandhan@mindgate.in');
Insert into employee_details
VALUES('MGS5239','Kavithalaya',80000,'29-AUGUST-2004','D104','Female','Tamil Nadu','kavithalaya.v@mindgate.in');
INSERT INTO employee_details 
VALUES ('MGS5228','Abinash', 100000.00, '27-Feb-2004','D104','Male','Tamil Nadu','abinash.s@mindgate.in');
INSERT INTO employee_details 
VALUES ('MGS5229','Manikanta',50000,'01-JULY-2003','D104','Male','Telangana','manikanta.aeruvaka@mindgate.in');
INSERT INTO EMPLOYEE_DETAILS 
VALUES ('MGS5240' , 'Mohan' ,30000, '27-May-2004' , 'D103' , 'Male','Tamil Nadu', 'mohanaselvan.mk@mindgate.in');
INSERT INTO EMPLOYEE_DETAILS
VALUES('MGS5244','senoj',40000,'19-MAY-2003','D102','Male','Tamil Nadu','senoj.s@mindgate.in');
INSERT INTO employee_details 
VALUES ('MGS5232', 'Astik Raj', 80000, '21-OCTOBER-2002', 'D103', 'Male', 'Tamil Nadu', 'astik.raj@mindgate.in');

SELECT * FROM employee_details;

-- Print employees working in IT department
SELECT 
    * 
FROM employee_details e 
INNER JOIN 
department_details d 
ON 
    e.department_id = d.department_id 
WHERE 
    d.department_name='IT';

-- Employees working in TRAINING, IT department
SELECT * FROM employee_details WHERE department_id IN
    (
        SELECT department_id FROM department_details WHERE department_name IN ('IT','TRAINING')
    );
-- Print count of Employees working in TRAINING, IT department     
SELECT  department_id, COUNT(department_id) FROM employee_details WHERE department_id IN
    (
        SELECT department_id FROM department_details WHERE department_name IN ('IT','TRAINING')
    )
GROUP BY department_id 
ORDER BY COUNT(department_id);

    
SELECT * FROM employee_details WHERE EXISTS (
SELECT * FROM department_details WHERE department_name IN 'TESTING'
);

-- Indexes
DROP TABLE members;
CREATE TABLE members(
    member_id NUMBER(5),
    first_name VARCHAR2(100) NOT NULL,
    last_name VARCHAR2(100) NOT NULL,
    gender CHAR(1) NOT NULL,
    dob DATE NOT NULL,
    email VARCHAR2(255) NOT NULL,
    CONSTRAINT member_id_pk PRIMARY KEY(member_id)
);
-- SELECT * FROM members where member_id=980;
EXPLAIN PLAN FOR
SELECT * FROM members WHERE first_name = 'Waring';

SELECT 
    PLAN_TABLE_OUTPUT 
FROM 
    TABLE(DBMS_XPLAN.DISPLAY());

CREATE INDEX members_first_name_i  ON members(first_name);

SELECT * FROM user_indexes WHERE table_name='MEMBERS';


-- Update , Delete , Select  - Primary Key


-- Client SQL 
-- Compile
-- Execution Plan
-- Executed 
-- Client - Output

-- Views
-- Kotak Bank - customer_details (customer_id,name,contact_no,email,pan,aadhar)
-- View - customers(customer_id,name,pan,aadhar)
-- View - customer_devl(customer_id,name,contact_no,email)

-- Mindgate 
-- SELECT * FROM customers;
-- UPDATE customers SET email='test@test.com' WHERE customer_id=....; // error 
-- UPDATE customers SET name='newname' WHERE customer_id=....; // work 

-- BLUE DART
-- SELECT * FROM customer_devl;
SELECT * FROM employee_details;

CREATE OR REPLACE VIEW employees 
AS 
    SELECT employee_id,name,salary,department_id,gender FROM employee_details WITH READ ONLY;
    
SELECT * FROM employees;
SELECT * FROM employees ORDER BY salary;
SELECT COUNT(gender),gender FROM employees GROUP BY gender;
UPDATE employee_details SET name='Ajay Kumar' WHERE employee_id='MGS5230';
UPDATE employees SET name='Ajay' WHERE employee_id='MGS5230';
SELECT * FROM employees;

-- SEQUENCES 
SELECT * FROM employee_details ORDER BY employee_id;

CREATE TABLE product_details(
    product_id VARCHAR2(10),
    name VARCHAR2(50) NOT NULL,
    price NUMBER(10,2) NOT NULL,
    CONSTRAINT product_id_pk PRIMARY KEY(product_id)
);

CREATE SEQUENCE product_id_seq 
START WITH 1000 INCREMENT BY 1;

INSERT INTO product_details VALUES('P'||product_id_seq.nextVal,'Think Book',90000);
INSERT INTO product_details VALUES('P'||product_id_seq.nextVal,'Vivo Book',90000);
INSERT INTO product_details VALUES('P'||product_id_seq.nextVal,'Mac Book',90000);
INSERT INTO product_details VALUES('P'||product_id_seq.nextVal,'No Book',90000);

SELECT * FROM product_details;

SELECT product_id_seq.currVal FROM dual;
SELECT product_id_seq.nextVal FROM dual;

-- Stored Procedure
-- Client SQL 

-- Compile - Stored
-- Execution Plan - Stored 
-- Executed 

-- Client - Output

SELECT * FROM employee_Details;
SELECT * FROM employee_Details WHERE name='Sadhan Kumar';


-- INSERT 
-- UPDATE
-- DELETE
-- SELECT
CREATE OR REPLACE PROCEDURE get_employee_name(employee_id_in IN VARCHAR2 , name_out OUT employee_details.name%TYPE)
AS
BEGIN
    SELECT name INTO name_out FROM employee_details WHERE employee_id = employee_id_in;
END;
/

set serveroutput on;

DECLARE
    employee_name VARCHAR2(50);
BEGIN
    dbms_output.put_line('start');
    get_employee_name('MGS5237',employee_name);
    dbms_output.put_line('Employee name of given id = ' ||employee_name );
    dbms_output.put_line('end');
END;
/
-- TRIGGERS
-- employee_details - update , delete 
-- TRIGGER
-- INSERT ROW INTO employee_audit

CREATE TABLE employee_audit (
      audit_id         NUMBER(10),
      table_name       VARCHAR2(255),
      transaction_name VARCHAR2(10),
      by_user          VARCHAR2(30),
      transaction_date DATE
);
ALTER TABLE employee_audit modify transaction_name VARCHAR2(50);

CREATE SEQUENCE employee_audit_id_seq START WITH 1001 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER employee_audit_trg
    AFTER 
    UPDATE OR DELETE
    ON employee_details
    FOR EACH ROW    
DECLARE
   l_transaction VARCHAR2(10);
BEGIN
   -- determine the transaction type
   l_transaction := CASE  
         WHEN UPDATING THEN 'UPDATE'
         WHEN DELETING THEN 'DELETE'
   END;

   -- insert a row into the audit table   
   INSERT INTO employee_audit (audit_id,table_name, transaction_name, by_user, transaction_date)
   VALUES(employee_audit_id_seq.NEXTVAL,'EMPLOYEE_DETAILS', l_transaction, USER, SYSDATE);
END;
/
SELECT USER FROM DUAL;
SELECT * FROM employee_details;  
SELECT * FROM employee_audit;  
TRUNCATE TABLE employee_audit;
UPDATE employee_details SET SALARY=SALARY + 100;
    
    
    
    
    
    
    
    
    
    
    
    
    
DROP TABLE IF EXISTS EMPLOYEE;
DROP TABLE IF EXISTS DEPARTMENT;

CREATE TABLE DEPARTMENT (
  department_id INT PRIMARY KEY,
  department_name VARCHAR(50) NOT NULL
);

CREATE TABLE EMPLOYEE (
  employee_id INT PRIMARY KEY,
  employee_name VARCHAR(50) NOT NULL,
  salary FLOAT NOT NULL,
  department_id INT
--   CONSTRAINT FK_DEPARTMENT
--   FOREIGN KEY(department_id) REFERENCES DEPARTMENT(department_id)
);

INSERT INTO 
	DEPARTMENT (department_id, department_name) 
VALUES
  	(101,'Mortgage'),
  	(102,'Retail'),
	(103,'Investments')
;

INSERT INTO 
	EMPLOYEE (employee_id, employee_name, salary, department_id) 
VALUES
  	(51,'Tom', 70000.88, 101),
  	(52,'Jack', 60000.56, 101),
  	(53,'John', 80800.56, 101),
  	(54,'David', 67677.434, 102)

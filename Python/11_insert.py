import getpass
import oracledb

pw = getpass.getpass("Enter password: ")

connection = oracledb.connect(
    user="training_mumbai",
    password=pw,
    dsn="localhost/xe")

print("Successfully connected to Oracle Database")
cursor = connection.cursor()
cursor.execute("INSERT INTO employee_details VALUES(101,'Test1',1000)")
cursor.execute("INSERT INTO employee_details VALUES(110,'Test2',1000)")
cursor.execute("INSERT INTO employee_details VALUES(103,'Test3',1000)")
cursor.execute("INSERT INTO employee_details VALUES(104,'Test4',1000)")
cursor.execute("INSERT INTO employee_details VALUES(105,'Test5',1000)")
connection.commit()
print("Records Inserted Successfully!")



cursor.close()
connection.close()

# pip install oracledb

import getpass
import oracledb

pw = getpass.getpass("Enter password: ")

connection = oracledb.connect(
    user="mindgate_chennai",
    password=pw,
    dsn="localhost/xe")
print("Successfully connected to Oracle Database")

connection.close()
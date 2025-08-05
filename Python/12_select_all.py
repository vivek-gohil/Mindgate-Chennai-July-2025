import oracledb



try:
    connection = oracledb.connect(
    user="mindgate_chennai",
    password="mindgate_chennai",
    dsn="localhost/xe")

    print("Successfully connected to Oracle Database")
    print("Connected")
    cursor = connection.cursor()
    cursor.execute("SELECT * FROM employee_details")
    res = cursor.fetchall()
    print("Table data:")
    col_names = [row[0] for row in cursor.description]
    for i in col_names:
        print(i, end='\t')
    print()
    for employee_id, name, salary, date_of_birth, department_id, gender, state, email_id in res:
        print(employee_id, '\t', name, '\t', salary, '\t', date_of_birth, '\t',department_id, '\t',gender, '\t',state, '\t',email_id)
    connection.commit()
    cursor.close()
    connection.close()
except Exception as e:
    print("Error: ", str(e))
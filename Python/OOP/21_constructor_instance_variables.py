#21_constructor_instance_variables.py

class Employee:
    def __init__(self, emp_id, name):
        self.emp_id = emp_id
        self.name = name

    def show(self):
        print(f"ID: {self.emp_id}, Name: {self.name}")

emp = Employee(101, "John")
emp.show()

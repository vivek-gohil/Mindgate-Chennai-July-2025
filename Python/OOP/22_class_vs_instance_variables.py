#22_class_vs_instance_variables.py

class Company:
    company_name = "TechCorp"  # class variable

    def __init__(self, employee_name):
        self.employee_name = employee_name  # instance variable

    def display(self):
        self.employee_name="Test"
        print(f"Employee: {self.employee_name}, Company: {Company.company_name}")

    def new_display(self):
        print(f"Employee: {self.employee_name}, Company: {Company.company_name}")

emp1 = Company("Meena")
#emp1.display()
emp1.new_display()

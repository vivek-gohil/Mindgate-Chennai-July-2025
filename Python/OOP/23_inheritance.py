#23_inheritance.py

class Person:
    def __init__(self,name):
        self.name=name
        print("constructor Person :: ",name)

    def greet(self):
        print("Hi, Good Afternoon")
        print("Name :: " , self.name)

class Student(Person):  # inherits from Person
    def study(self):
        print("In Student : study")

s = Student("Ravi")
s.greet()
s.study()

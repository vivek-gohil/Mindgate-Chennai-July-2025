class Student:
    def __init__(self, roll_no, name, marks):
        self.roll_no = roll_no
        self.name = name
        self.marks = marks

    def display_info(self):
        print(f"Roll No: {self.roll_no}, Name: {self.name}, Marks: {self.marks}")


class StudentManager:
    def __init__(self):
        self.students = []

    def add_student(self, roll_no, name, marks):
        student = Student(roll_no, name, marks)
        self.students.append(student)
        print(f"Student {name} added successfully.")

    def display_all_students(self):
        if not self.students:
            print("No students to display.")
        for student in self.students:
            student.display_info()

    def search_student(self, roll_no):
        for student in self.students:
            if student.roll_no == roll_no:
                print("Student found:")
                student.display_info()
                return
        print("Student not found.")

    def delete_student(self, roll_no):
        for student in self.students:
            if student.roll_no == roll_no:
                self.students.remove(student)
                print(f"Student with Roll No {roll_no} deleted.")
                return
        print("Student not found.")

from student import StudentManager

def main():
    manager = StudentManager()

    while True:
        print("\n--- Student Management System ---")
        print("1. Add Student")
        print("2. Display All Students")
        print("3. Search Student by Roll No")
        print("4. Delete Student by Roll No")
        print("5. Exit")

        choice = input("Enter choice: ")

        if choice == "1":
            roll = int(input("Enter roll no: "))
            name = input("Enter name: ")
            marks = float(input("Enter marks: "))
            manager.add_student(roll, name, marks)

        elif choice == "2":
            manager.display_all_students()

        elif choice == "3":
            roll = int(input("Enter roll no to search: "))
            manager.search_student(roll)

        elif choice == "4":
            roll = int(input("Enter roll no to delete: "))
            manager.delete_student(roll)

        elif choice == "5":
            print("Exiting... Goodbye!")
            break

        else:
            print("Invalid choice. Try again.")

if __name__ == "__main__":
    main()

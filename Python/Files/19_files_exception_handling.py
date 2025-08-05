# file_exception_handling.py
try:
    with open("nonexistent.txt", "r") as file:
        print(file.read())
except FileNotFoundError:
    print("File not found. Please check the file name.")
except Exception as e:
    print("An error occurred:", e)

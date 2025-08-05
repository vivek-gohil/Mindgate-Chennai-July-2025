try:
    with open("misc/sample.txt", "r") as file:
        content = file.read()
        print("File content:\n", content)
except FileNotFoundError:
    print("The file does not exist.")

class NegativeMarksError(Exception):
    def __init__(self, message="Marks cannot be negative"):
        super().__init__(message)

def check_marks(marks):
    if marks < 0:
        raise NegativeMarksError()
    else:
        print("Marks are valid:", marks)

try:
    check_marks(-10)
except NegativeMarksError as e:
    print("Caught custom exception:", e)

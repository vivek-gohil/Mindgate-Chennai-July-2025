try:
    num = int(input("Enter a positive number: "))
    assert num > 0, "Number must be positive"
except ValueError:
    print("Invalid input: Please enter a number.")
except AssertionError as e:
    print("Assertion failed:", e)
else:
    print("You entered:", num)
finally:
    print("Execution complete.")

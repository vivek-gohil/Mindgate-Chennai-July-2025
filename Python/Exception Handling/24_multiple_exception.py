try:
    a = int(input("Enter A: "))
    b = int(input("Enter B: "))
    print("A / B =", a / b)
except (ValueError, ZeroDivisionError) as e:
    print("Error occurred:", e)

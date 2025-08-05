# write_csv.py
import csv

data = [
    ["ID", "Name", "Salary"],
    [1, "Seema", 50000],
    [2, "Meena", 60000],
    [3, "Reema", 55000]
]

with open("output_employees.csv", "w",newline="") as file:
    writer = csv.writer(file)
    writer.writerows(data)

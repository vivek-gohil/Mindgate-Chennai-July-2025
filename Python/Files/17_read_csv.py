# read_csv.py
import csv

with open("customer.csv", "r") as file:
    reader = csv.reader(file)
    for row in reader:
        print(row)

fruits = ["apple" , "banana" , "cherry"]
for x in fruits:
	print(x)

print("-" * 80)

#looping through a String
for x in "banana":
	print(x, end="")

print("-" * 80)

#break statement
fruits = ["apple" , "banana" , "cherry"]
for x in fruits:
	print(x)
	if x  == "banana":
		break

print("-" * 80)

#continue
fruits = ["apple" , "banana" , "cherry"]
for x in fruits:
	if x == "banana":
		continue
	print(x)

print("-" * 80)




#Range function
# 0 to 5 
for x in range(6):
	print(x)

print("-" * 80)

#Range function
# 2 to 5 
for x in range(2,6):
	print(x, end = " , ")

print("-" * 80)

#Range function
# 2 to 5 
for x in range(2,30,3):
	print(x)

print("-" * 80)

#Nested loop
adj = ["red" , "big" , "tasty"]
fruits = ["apple" , "banana" , "cherry"]

for x in adj:
	for y in fruits:
		print(x , y)

print("-" * 80)

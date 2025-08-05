#creating simple functions
def my_function():
	print("Hello from a function")

my_function()
my_function()

print("-" * 80)

#passing args to function
def my_function(fname):
	print("First Name :: ",fname)

my_function("Mindgate")

print("-" * 80)

#passing two args to function
def my_function(fname , lname):
	print("First Name :: " + fname)
	print("Last Name :: " + lname)

my_function("Vivek" , "Gohil")

print("-" * 80)

#Arbitrary Arguments , *args
#if the number of arguments is unknown , add a * before the parameters name:

def my_function(*kids):
	for kid in kids:
		print(kid)

my_function("Jimmy", "Jhonny")

fruits = ["apple" , "banana" , "cherry"]
my_function(fruits)
print("-" * 80)


#keyword Arguments
def my_function(child3 ,child2 , child1):
	print("The youngest child is "+ child3)

my_function(child1 = "Ram" ,child2 ="Laxman" ,child3 = "Bharat")

print("-" * 80)

#Arbitrary keyword Arguments , *kwargs
def my_function(**name):
	print("His last name is "+name["lname"]);
	print("His first name is "+name["fname"]);

my_function(fname="Vivek" ,lname = "Gohil",leaf="Green")

print("-" * 80)

#Default value parameters
def my_function(country = "India"):
	print("I am from " + country)


my_function("Norway")
my_function("Sweden")
my_function()
my_function("Brazil")

print("-" * 80)



#Passing list as an Args
def my_function(foods):
	for food in foods:
		print(food)

fruits = ["apple" , "banana" , "cherry"]
my_function(fruits)

print("-" * 80)

#Return Value from function
def my_function(x):
	print("my_function called")
	return 5 *x

my_function(3)
print("-" * 80)
print(my_function(3))
print("-" * 80)
print(my_function(9))
print("-" * 80)
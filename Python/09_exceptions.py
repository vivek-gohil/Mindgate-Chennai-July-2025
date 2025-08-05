#initalize the variable
amount = 100

#perform division with 0
try:
	result = amount / 0
	print(result)
except ZeroDivisionError:
	print("You cannot divide amount by 0")

print("-" * 80)






#Example 2
numbers = [1 ,2 ,3 ]
try:
	print(numbers[0])
	print(numbers[1])
	print(numbers[2])
	print(numbers[3])
except IndexError:
	print("Invalid index !")
finally:
	print("This block always will get executed ")



print("-" * 80)

#Example 3
#Raise exception
try:
	x = -1
	if x < 0:
  		raise Exception()
except Exception:
	print("Sorry, no numbers below zero")  	
finally:
	print("This block always will get executed ")	


	


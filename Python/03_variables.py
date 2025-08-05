age = 24
print(age)

print(type(age))

age_in_words = "2 years"
print(age_in_words)
print(type(age_in_words))
# print("age :: " + age + " and age in worlds :: " + age_in_worlds)

print("My age is " + str(age_in_words)+ " years")

print("My age is {0} years".format(age_in_words))

print("There are {0} days in {1} , {2} , {3} , {4} , {5} , {6} and {7}"
.format(31, "Jan" ,"Mar" , " May" , "July" , " Aug"  , "Oct" , "Dec"))

print("Jan : {2} , Feb: {0} , Mar: {2} , Apr: {1} , May: {2} , Jun: {1} , july: {2} , Aug: {2}"
      .format(28,30,31))

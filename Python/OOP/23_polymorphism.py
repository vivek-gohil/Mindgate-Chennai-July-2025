#23_polymorphism.py

class Animal:
    def make_sound(self):
        print("Some generic sound")

class Dog(Animal):
    def make_sound(self):
        print("Bark!")

class Cat(Animal):
    def make_sound(self):
        print("Meow!")

animals = [Dog(), Cat(), Animal()]

for a in animals:
    a.make_sound()

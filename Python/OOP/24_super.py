class Vehicle:
    def __init__(self, brand):
        self.brand = brand

    def show(self):
        print(f"Brand: {self.brand}")

class Car(Vehicle):
    def __init__(self, brand, model):
        super().__init__(brand)
        self.model = model

    def show(self):
        super().show()
        print(f"Model: {self.model}")

c = Car("Toyota", "Camry")  
c.show()

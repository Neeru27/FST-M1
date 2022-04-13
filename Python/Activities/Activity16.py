class Car:
    'This class represents a car'

    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer + " " + self.model + " has started moving")

    def stop(self):
        print(self.manufacturer + " " + self.model + " has stopped moving")

car1 = Car("Toyota", "Corolla", "2022", "Manual", "White")
car2 = Car("Maruti", "800", "2021", "Manual", "Red")
car3 = Car("Suzuki", "Swift", "2019", "Automatic", "Black")

car1.accelerate()
car1.stop()
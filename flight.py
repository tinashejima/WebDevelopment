class Flight():
    def __init__(self, capacitty):
        self.capacity = capacitty
        self.passengers = []

    def add_passengers(self, name):
        if self.open_seats() ==0:
            return False
        self.passengers.append(name)
        return True

    def open_seats(self):
        return self.capacity - len(self.passengers)


flight = Flight(3) 


people = ["Tynash", "Teejay", "Taps", "Takue"]
for person in people:
    success =flight.add_passengers(person)
    if success:
        print(f"Added {person} to flight successfully")
    else:
        print(f"No available seats for {person}")
class Robot:
    def __init__(self,n,c,w):
        self.name = n
        self.name = c
        self.weight = w
    def intro_self(self):
        print("My Name is "+self.name)

class Person:
    def __init__(self, n, p, i):
        self.name = n
        self.personality = p
        self.is_sitting = False

    def sit_down(self):
        self.is_sitting = True
    def stand_up(self):
        self.is_sitting = False

p1 = Person("A","Aggresive",True)
p1.robot_owned = Robot("Robot1","Blue",50)


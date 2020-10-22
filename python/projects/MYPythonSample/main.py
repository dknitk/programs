import NumberSwap

from Student import Student
from ChineesChef import ChineesChef
class main:
    def swap(a,b):             
        print(" a ")
        print(a)
        print(" b ")
        print(b)
        print(" Values after Swap ")
        temp = a
        a = b
        b = temp
        print(" a ")
        print(a)
        print(" b ")
        print(b)
    # swap(10,30)

    def bmi_cal(name, weight, height):
        print("BMI calculator application")
        result = weight/ height ** 2
        if(result < 25):
            print(name+" is not Overweight")
        else:
            print(name+" is Overweight")         
    
    # bmi_cal("Dharmendra", 90, 2)

    # Miles to KM calculator
    def milesToKMConvertor(miles):
        print("Miles to KM calculator Application")
        km = 1.16*miles
        return km
    # Call method to convert
    # result = milesToKMConvertor(10)
    # print("KM is ") 
    # print(result)

    def ifelseif(a):        
        if(a < 10):
            print("a is less than 10")
        elif(a ==10):
            print("a is equal to 10")
        elif(a > 10):
            print("a is greater than 10")
        else:
            print("Value of a is not not correct")

    # ifelseif(0000)
    def listFunction():
        list = [1,2,3,4]
        print(list)

        # append the number
        list.append(200)
        print(list)
        # append another String
        list.append("Hello Python")
        print(list)
        # append another list
        list.append([-2,-6,-10])
        print(list)

        #Pop the value from the list
        a = list.pop()
        print("Value Popped :")
        print(a)
        print(list)
        a = list.pop()
        print("Value Popped :")
        print(a)
        print(list)

        #Swap element        
        list[0],list[2] = list[2],list[0]
        print(list)

    # listFunction()
    # for loop and range
    def forLoopAndRange():
        print("Inside Foor Loop and Range Method")
        a = [1,2,3,5]
        for e in a:
            print(e)

        b = list(range(1,10))
        print(b)
        for e in range(1,10):
            print(e)

        total1 = 0
        for e in range(1,10):
            if e % 3 == 0:
                total1 += e
        print(total1)

    # forLoopAndRange()

    def whileLoopFunction():
        list = [1,2,3,4]
        i = 0
        print(len(list))
        while i < len(list):
            print(list[i])
            i += 1;
    # whileLoopFunction()
    def dictFunction():
        print("Dictionary Function")
        a = {"A":10}
        a["Ram"] = 100
        a["Shyam"] = 200
        print(a)

        for key, value in a.items():
            print("Key:")
            print(key)            
            print("Value:")
            print(value)
            print("")

        b = dict();
        b["B"] = 20
        print(b)
    # dictFunction()
def twoDListFunction():
    number_2DList = [
        [1,2,3,4],
        [5,6,7,8],
         [10,60,70,80,100],
        [7]
    ]
    print(number_2DList)
    print(number_2DList[1][3])
    for row in number_2DList:
        for col in row:
            print(col)
    
# twoDListFunction()

def tryExceptExample():
    try:
        #number = 10/0
        num1 = input("Enter a number: ")
        print(num1)
    except ZeroDivisionError as err:
        print(err)
    except ValueError as err1:
        print(err1)

# tryExceptExample()
def readFileExample():
    employee_file = open("employee.txt","a")
    print(employee_file.readable())
    employee_file.write("asdasdasd : asdasdasdasd")
    for employee in employee_file.readlines():
        print(employee)
    employee_file.close()

# readFileExample()
student1 = Student("Dharmendra","Science","7.4",False)
print(student1.name)
ChineesChef.make_fried_rice()
ChineesChef.make_chicken()

# Utility Function
# Code listing #10

""" Module A (a.py) - Implement functions that operate on series of numbers """

# Note this is version 1 of a.py so called a1.py

def squares(narray):
    """ Return array of squares of numbers """
    return pow_n(array, 2)

def cubes(narray):
    """ Return array of cubes of numbers """
    return pow_n(narray, 3)

def pow_n(narray, n):
    """ Return array of numbers raised to arbitrary power n each """
    return [pow(x, n) for x in narray]
    
def frequency(string, word):
    """ Find the frequency of occurrences of word in string
    as percentage """

    word_l = word.lower()
    string_l = string.lower()

    # Words in string
    words = string_l.split()
    count = words.count(word_l)

    # Return frequency as percentage
    return 100.0*count/len(words)

# freq = frequency("This is a School and Kids are here","This");
#print("Frequency Is:: ");
#print(freq)
def sample(a, b):
    print("Sample Python")

    lambda1 = lambda a, b: a+b
    print(lambda1)
sample(10,30)

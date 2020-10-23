class KWSwapTwoNumber:
    def swapTwoNumber(a , b):
        print("*** Swap Two Number Application ****")
        print("Number Before Swapping :: a: "+str(a) + " , b: "+str(b))
        temp = a
        a = b
        b = temp
        print("Number After Swapping :: a: " + str(a) + " , b: " + str(b))

    # Call method to execute the Logic
    swapTwoNumber(20, 33)


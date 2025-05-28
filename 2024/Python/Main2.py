import Mhm as m

def arithmetic():
    # print("Would you like to add, subtract, multiply or divide?: ")
    # user_input = input()
    if user_input == f"+":
        plus = m.addition()
    elif user_input == "subtract":
        minus = m.subtraction()
    elif user_input == "multiply":
        times = m.muiltiplication()
    elif user_input == "divide":
        divide = m.division()
    else:
        print("No input given")

arithmetic()






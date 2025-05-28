import random as r

def guess_number(): #Create a function
        number = r.choice(range(1, 100)) #it should pick a random number between 1 and 100
        print(number) #display the number
        while True:
            guess = int(input("Guess a number between 1 and 100:"))# =ask the user to input their guess
            if guess < 1 or guess > 100: #If the guess is less than 1 or greater than 100
                print("Are you stupid, I said between 1 and 100!")
            elif guess == number: #If the correct guess
                print("CORRECT!")
                break
            elif guess < number:
                print("Too low")
            else:
                print("Too high")


guess_number()




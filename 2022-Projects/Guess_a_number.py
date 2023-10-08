secret_number = 2
guess = int

while guess != secret_number:
    guess = int(input("Enter guess: "))
    if guess == secret_number:
        print(f"Yay! Youn guessed it! The secret number is {secret_number}")
    else:
        print("Fuck! You got it all weong mate!")
        if guess <= secret_number:
            print("Too low dude!")
        else:
            print("Too high bro!")
        print("Try again!")

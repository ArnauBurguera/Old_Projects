import random
from Words import word_list
import string #per uppercase predetermined list in alphabet variable 

def get_valid_word(words):
    word = random.choice(word_list)
    while "-" in word or " " in word:
        word = random.choice(word_list)
    
    return word.upper()

def hangman():
    word = get_valid_word(words)
    word_letters = set(word) #Letters in word (keeping track). set = Save multiple items in a varaible
    alphabet = set(string.ascii_uppercase) # In Python, string ascii_uppercase will give the uppercase letters ‘ABCDEFGHIJKLMNOPQRSTUVWXYZ’.
    used_letters = set() # what the user has guessed

    # getting user input
    while len(word_letters) > 0:
        # letters used
        # ' '.join(['a', 'b', 'cd']) --> 'a b cd'
        print("You have used these letters: ", " ".join(used_letters))

        user_letter = input("Guess a letter: ").upper()
        if user_letter in alphabet - used_letter:
            used_letters.add(user_letter)
            if user_letter in word_letters:
                word_letters.remove(user_letter)
        elif user_letter in used_letters:
            print("You have already used that character. Please try again. ")
        else:
            print("Invalid character. Please try again. ")

    # gets here when word_letters == 0
i = 1
# While Loop Example
while i <= 10:
    print(i)
    i += 1
print("Loop Completed")

# Guess Game

secret_word = "Dharmendra"
guess = ""
guess_count = 0
out_of_guesses = False
guess_limit = 10

while guess != secret_word and not(out_of_guesses):
    if guess_count < guess_limit:
        guess = input("Enter the Guess: ")
        guess_count += 1
    else:
        out_of_guesses = True
if out_of_guesses:
    print("Out Of Guesses, You Lose!!!")
else:
    print("You Win!")
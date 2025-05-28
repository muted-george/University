def is_palindrome():
    word = input('Enter a word: ')
    if word == word[::-1]:
        print('Palindrome')
    else:
        print('Not Palindrome')

is_palindrome()
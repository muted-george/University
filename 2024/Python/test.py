def fullname():
    first = input("Enter first name: ")
    first = first.title()
    last = input("Enter last name: ")
    last = last.title()
    return f"{first} {last}"

print(fullname())
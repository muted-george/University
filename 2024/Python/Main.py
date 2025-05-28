import text_reverse as tr

def reverse_name():
    try:
        first_name = input("Enter your first name: ")
        first_name = first_name.title().strip()
        last_name = input("Enter last name: ")
        last_name = last_name.title().strip()

        if len(first_name) + len(last_name) < 5:
            raise ValueError("Names must have at least 5 characters")

        fullname = first_name + " " + last_name

        reversed_name = tr.reverse_text(fullname)

        print(f"Reverse name:", reversed_name)

    except ValueError as ve:
        print(ve)

reverse_name()


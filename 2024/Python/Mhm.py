
def addition():
    x = float(input('x:'))
    y = float(input('y:'))
    sum = x + y
    print(f"{x} + {y} = {sum}")
    return sum


def subtraction():
    x = float(input('x:'))
    y = float(input('y:'))
    difference = x - y
    print(f"{x} - {y} = {difference}")
    return difference

def muiltiplication():
    x = float(input('x:'))
    y = float(input('y:'))
    product = x * y
    print(f"{x} * {y} = {product}")
    return product

def division():
    x = float(input('x:'))
    y = float(input('y:'))
    try:
        if y == 0:
            raise ZeroDivisionError("You cannot divide by 0!!!!")
        quotient = x / y
        print(f"{x} / {y} = {quotient}")
        return quotient

    except ZeroDivisionError as zde:
        print(zde)





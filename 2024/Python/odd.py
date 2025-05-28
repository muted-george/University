sequence = (1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 9)

def odd_nums():
    for i in sequence:
        if i % 2 != 0:
            print(i)

odd_nums()
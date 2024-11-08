while True:
    x, y = [int(x) for x in input().split()]
    if x == y:
        break
    elif x > y:
        print("Decrescente")
    else:
        print("Crescente")

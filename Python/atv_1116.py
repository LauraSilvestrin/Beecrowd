n = int(input())
for i in range(n):
    x, y = [int(x) for x in input().split()]
    if(y == 0):
        print("divisao impossivel")
    else:
        divisao = float(x/y)
        print("{:.1f}".format(divisao))
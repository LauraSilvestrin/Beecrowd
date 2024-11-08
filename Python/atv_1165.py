n = int(input())
for i in range(n):
    cont = 0
    xis = int(input())
    for i in range(1, xis+1):
        if (xis%i == 0):
            cont+=1
    if (cont > 2):
        print(xis,"nao eh primo")
    else:
        print(xis,"eh primo")
    
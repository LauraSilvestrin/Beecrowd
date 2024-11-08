soma = float(0)
cont = 0 
while True:
    n = int(input())
    if n < 0:
        print("{:.2f}".format(soma/cont))
        break
    else:
        cont += 1
        soma += n

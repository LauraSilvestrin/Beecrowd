n1, d1, v1 = [int(x) for x in input().split()]
n2, d2, v2 = [int(x) for x in input().split()]
resultado1 = float(0)
resultado2 = float(0)

resultado1=d1/v1
resultado2=d2/v2

if resultado1<resultado2:
    print(n1)

if resultado2<resultado1:
    print(n2)
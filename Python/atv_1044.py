a, b= [int(x) for x in input().split()]
if a>b:
    if a%b==0:
        print("Sao Multiplos")
    else:
        print("Nao sao Multiplos")

if a<b:
    if b%a==0:
        print("Sao Multiplos")
    else:
        print("Nao sao Multiplos")
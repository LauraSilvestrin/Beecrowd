import math
n = int(input())
if n%2 == 0:
    n = n*n
    n = n/2
    n = math.floor(n)
    print(f"{n} casas brancas e {n} casas pretas")
else:
    n = n*n
    n = n/2
    n = math.floor(n)
    print(f"{n+1} casas brancas e {n} casas pretas")


import math
b = int(input())
g = int(input())

r = g/2 -b
r = math.floor(r)

if r > 0:
    print(f"Faltam {r} bolinha(s)")
else:
    print("Amelia tem todas bolinhas!") 
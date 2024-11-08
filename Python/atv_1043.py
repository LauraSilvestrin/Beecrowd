a, b, c = [float(x) for x in input().split()]

if a<b+c and b < a + c and c < a + b:
    print(f"Perimetro = {(a + b + c):.1f}")
else:
    print(f"Area = {(c * (a + b)) / 2:.1f}")


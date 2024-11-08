a, b, c = [float(x) for x in input().split()]

PI = 3.14159

areaTriangulo = a * c / 2
areaCirculo = PI * (c * c)
areaTrapezio = ((a + b) * c) / 2
areaQuadrado = b * b
areaRetangulo = a * b

print("TRIANGULO: {:.3f}".format(areaTriangulo))
print("CIRCULO: {:.3f}".format(areaCirculo))
print("TRAPEZIO: {:.3f}".format(areaTrapezio))
print("QUADRADO: {:.3f}".format(areaQuadrado))
print("RETANGULO: {:.3f}".format(areaRetangulo))
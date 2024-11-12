idades = [int(x) for x in input().split()]
sobrinhos = {idades[0]:"huguinho", idades[1]:"zezinho", idades[2]:"luisinho"}
idades.sort()
print(sobrinhos[idades[1]])
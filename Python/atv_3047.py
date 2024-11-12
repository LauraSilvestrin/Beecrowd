m = int(input())
idades = []
idades.append(int(input())) 
idades.append(int(input()))
idade3 = m - (idades[0]) - idades[1]
idades.append(idade3)
idades = sorted(idades)
print(idades[2])
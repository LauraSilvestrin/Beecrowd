pos = int()
neg = int()
pares = int()
impares = int()
for i in range(5):
    x = int(input())
    if x > 0:
        pos += 1
    elif x < 0:
        neg += 1

    if x % 2 == 0:
        pares +=1
    else:
        impares += 1

print(f"{pares} valor(es) par(es)")
print(f"{impares} valor(es) impar(es)")
print(f"{pos} valor(es) positivo(s)")
print(f"{neg} valor(es) negativo(s)")
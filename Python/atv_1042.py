linha = input().split()
vet = [int(i) for i in linha]

vet.sort()

print(*vet, sep="\n")
print()

print(*linha, sep="\n")
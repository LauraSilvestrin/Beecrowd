positivos=0

for x in range(1,7):
    n=float(input())
    if n>0:
        positivos+=1
print('{} valores positivos'.format(positivos))
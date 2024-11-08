pares = 0

for i in range(5):
    a = int(input())
    
    if a % 2 == 0:
        pares+=1
    
print(f"{pares} valores pares")
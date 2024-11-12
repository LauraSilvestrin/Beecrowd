n = int(input())
cha = list()
cha = [int(x) for x in input().split()]
cont = int()
for i in range(5):
    if (cha[i] == n):
        cont+=1
        
print(cont)
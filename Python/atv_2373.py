n = int(input())
quebrados = 0
for i in range(n):
    latas, copos = [int(x) for x in input().split()]
    if latas > copos:
        quebrados += copos

print (quebrados) 
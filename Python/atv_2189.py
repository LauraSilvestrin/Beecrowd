teste = 0

while True:
    participantes = int(input())
    
    if participantes == 0:
        break

    ingresso = [int(x) for x in input().split()]
    i = int()
    
    for i in range(participantes):
        if ingresso[i] == i + 1:
            teste += 1
            print("Teste", teste)
            print(i + 1)
            print()
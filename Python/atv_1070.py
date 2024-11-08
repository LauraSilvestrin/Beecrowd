n=int(input())

if n%2==0:
    n+=1
    print(n)
    for i in range(0, 5):
        n+=2
        print(n)
else:
    print(n)
    for i in range(0, 5):
        n+=2
        print(n)

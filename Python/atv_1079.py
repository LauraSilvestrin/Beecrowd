n = int(input())
media = float()
for i in range(n):
    x1, x2, x3 = [float(x) for x in input().split()]
    media = ((2*x1)+(3*x2)+(5*x3))/(2+3+5)
    print(float("{:.1f}".format(media)))
        
p1, c1, p2, c2 = [int(x) for x in input().split()]
if ((p1*c1) == (p2*c2)):
    print("0")
if((p1*c1) < (p2*c2)):
    print("1")
if((p1*c1) > (p2*c2)):
    print("-1")
H, E, A, O, W, X = [int(x) for x in input().split()]
if (H+E+A+X) >= (O+W):
    print("Middle-earth is safe.")
else:
    print("Sauron has returned.")
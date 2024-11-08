codg, qtdDeItens = [float(x) for x in input().split()]
preco=float()
total=float()
    
if codg == 1:
    preco = 4.00*qtdDeItens
    print("Total: R$ {:.2f}".format(preco))
    
elif codg == 2:
    preco = 4.50*qtdDeItens;
    print("Total: R$ {:.2f}".format(preco))
                
elif codg == 3:
    preco = 5.00*qtdDeItens;
    print("Total: R$ {:.2f}".format(preco))    
        
elif codg == 4: 
    preco = 2.00*qtdDeItens;
    print("Total: R$ {:.2f}".format(preco))
            
elif codg == 5:
    preco = 1.50*qtdDeItens;
    print("Total: R$ {:.2f}".format(preco))
#Exercicio 2

idd=int(input("Qual sua idade? "))

if idd >= 16:
    if idd >= 18 and idd <= 69:
        print(" Tipo de Voto = Obrigatório")

    elif idd == 16 or idd == 17 or idd >=70:
        print("Tipo de Voto = Facultativo")
    
else:
    print ("Não eleitor")

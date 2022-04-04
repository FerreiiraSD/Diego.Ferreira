#Exercicio 5

n1=float(input("Digite um numero "))
n2=float(input("Digite um numero "))
n3=float(input("Digite um numero "))

if n1>n2 and n1>n3:
    print("O número %.0f é maior" %n1)

elif n2>n1 and n2>n3:
    print("O número %.0f é maior" %n2)

elif n3>n1 and n3>n2:
    print("O número %.0f é maior" %n3)

else:
    print ("Todos numeros são iguais")

if n1<n2 and n1<n3:
    print("O número %.0f é menor" %n1)

elif n2<n1 and n2<n3:
    print("O número %.0f é menor" %n2)

elif n3<n1 and n3<n2:
    print("O número %.0f é menor" %n3)

else:
    print ("Todos numeros são iguais")

if n1>n2 and n1<n3:
    print("O número %.0f é médio" %n1)

elif n2>n1 and n2<n3:
    print("O número %.0f é médio" %n2)

elif n3 > n2 and n3< n1:
    print("O número %.0f é médio" %n3)

else:
    print ("Todos numeros são iguais")




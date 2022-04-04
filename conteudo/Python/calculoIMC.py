#Exercicio 02

input("Para ser calculado seu Indice de Massa Corporal\niremos solicitar seu peso e altura. Pressione enter")

peso=float(input("\nDigite seu preso: "))
altura=float(input("e a sua altura: "))

imc=peso/(altura**2)

print("\nSua Massa é: %.1f" %imc)

if (imc >= 10) and (imc < 18.5):
    print("Menor que 18,5 - Magreza")

elif (imc >= 18.5) and (imc < 24.9):
    print("Entre 18,5 e 24,9 - Normal")

elif (imc >= 25) and (imc < 29.9):
    print("Entre 25,0 e 29,9  - Sobrepeso")

elif (imc >= 30) and (imc < 39.9):
    prit("Entre 30,0 e 39,9  - Obesidade")

elif (imc >=40) and (imc <=70):
    print("Maior que 40,0 - Obesidade Grave")

else:
    print("valor incorreto")

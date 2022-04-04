#Calculo IMC peso/altura²

input("Para ser calculado seu Indice de Massa Corporal\niremos solicitar seu peso e altura. Pressione enter")

peso=float(input("\nDigite seu preso: "))
altura=float(input("e a sua altura: "))

imc=peso/(altura**2)

print("\nSua Massa é: %.1f" %imc)

print( "\nMenor que 18,5     - Magreza",
"\nEntre 18,5 e 24,9  - Normal",
"\nEntre 25,0 e 29,9  - Sobrepeso",
"\nEntre 30,0 e 39,9  - Obesidade",
"\nMaior que 40,0     - Obesidade Grave")      

input("")

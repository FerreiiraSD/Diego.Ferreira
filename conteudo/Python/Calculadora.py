v1=float(input("Digite o primeiro valor a ser calculado "))
v2=float(input("Digite o segundo valor a ser calculado "))
f=input("Qual a função que deseja\n\n"
            "Soma              →  +\n"
            "Subtração       →  -\n"
            "Divisão            →  /\n"
            "Multiplicação   →  *\n")

if f == "+" or f == "soma" or f == "Soma":
    print("A soma dos valores é : ", v1+v2)

elif f == "-" or f == "subtração" or f == "Subtração":
    print("A subtração dos valores é : ", v1-v2)

elif f == "/" or f == "divião" or f == "Divisão":
    print("A divisão dos valores é : ", v1/v2)

elif f == "*" or f == "multiplicação" or f == "Multiplicação":
    print("A multiplicação dos valores é : ", v1+v2)

else:
    print("Digite uma função valida")

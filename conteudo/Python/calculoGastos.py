ag=float(input("Qual valor da sua conta de Agua. R$ "))
lz=float(input("Qual valor da sua conta de Luz. R$ "))
tel=float(input("Qual valor da sua conta de Telefone. R$ "))
sal=float(input("Quanto é sua renda? R$ "))

ct=ag+lz+tel
sb=sal-ct

if ct > sal:
    print("Salário insuficiente!")

else:
    print("Você conseguirá pagar suas contas e vai te sobrar R$ ", sb)

#Exercicio 3

nm=input("Qual seu nome? ")
hm=float(input("Quantas horas mensais vc trabalha? "))
he=float(input("Quantas horas vc fez a mais esse mês? "))
f=int(input("Faltou algum dia? "))

ht = he + (hm - f*8)

print(nm ,"você trabalhou %.2f horas no mês, sendo elas %.2f horas extras" %(ht,he))


# Exercicio 3 - Calculando valor em atraso #

vp=float(input("Qual valor da prestação? R$ "))
mt=float(input("Quanto é a multa por dia? R$ "))
qdia=int(input("Quantos dias de atraso? "))

vpa=vp*0.02 # Encargo de 2% do valor por atraso
mtt=(vp*(mt/100))*qdia # Encargo de 0.33% por dia
ve=vpa+mtt

va=vpa+mtt+vp #Valor atualizado

print("\nEncargos R$ %.2f" %ve)
print("O valor atualizado da prestação fica em R$ %.2f" %va)


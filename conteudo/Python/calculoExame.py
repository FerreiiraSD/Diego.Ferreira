#Exercicio 4

ex=input("Qual exame deseja fazer o orçamento?\n\n A - Angiografia \n B - Venografia \n C - Urografia \n D - Ultrasson \n\n Selecione apenas a letra: ")

if ex == "A" or ex == "a" or ex == "B" or ex == "b" or ex == "C" or ex == "c" or ex == "D" or ex == "d":

	if ex == "A" or ex == "a":
		print("\n Angiografia = R$ 155,50 ")

	elif ex == "B" or ex == "b":
		print("\n Venografia = R$ 95,50 ")

	elif ex == "C" or ex == "c":
		print("\n Urografia = R$387,95 ")

	else:
		print("\n Ultrasson = R$79,99 ")

else:
	print("\n Não realizamos esse exame ")

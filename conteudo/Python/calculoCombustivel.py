#Exercicio 1
#
#Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km)
#e o total de combustível gasto (em litros).
#
#Entrada
#
#O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total
#percorrida (em Km), e um valor real Y representando o total de combustível gasto, com um
#dígito após o ponto decimal.
#
#Saída
#
#Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula,
#seguido da mensagem "km/l".

ck=int(input("Qual foi a distância percorrida em KM? "))

cg= float(input("Quanto de combustivel você gastou? "))

cm = (ck / cg)

print("\nSeu consumo foi de %.3f Km/l" %cm)

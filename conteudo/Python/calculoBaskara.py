#Exercicio 2
#
#Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara.
#Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossível calcular”,
#caso haja uma divisão por 0 ou raiz de número negativo.
#
#Entrada
#
#Leia três valores de ponto flutuante (double) A, B e C.
#
#Saída
#
#Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossível calcular".
#Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem
#correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.

v = input("Digite 3 valores separando-os por espaço ").split()

n1, n2, n3 = v

n1 = float(n1)
n2 = float(n2)
n3 = float(n3)

if n1 == 0.0  or (n2 ** 2 - 4 * n1 * n3) <= 0:
    print("\nImpossível calcular")
    
else:
    r1 = (- n2 + (n2 ** 2 - 4 * n1 * n3) ** (1/2) )/(2 * n1)
    r2 = (- n2 - (n2 ** 2 - 4 * n1 * n3) ** (1/2) )/(2 * n1)
    
    print("\nRaíz 1 = %.5f" %r1)
    
    print("\nRaíz 2 = %.5f" %r2)

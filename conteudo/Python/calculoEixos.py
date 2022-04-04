#Exercicio 3
#
#Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1, y1)
#e p2(x2, y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:
#Distancia = raiz quadrada de parêntese esquerdo x 2 menos x 1 parêntese direito ao quadrado espaço mais
#parêntese esquerdo y 2 menos y 1 parêntese direito ao quadrado fim da raiz
#
#Entrada
#
#O arquivo de entrada contém quatro linhas de dados. A primeira linha contém o valor de x1, a segunda linha y2,
#a terceira linha x2 e a quarta linha y2. Todos os valores em ponto flutuante:
#
#Saída
#
#Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.

import math

x1 = float(input("Digite o valor de X¹ "))
y1 = float(input("Digite o valor de X² "))
x2 = float(input("Digite o valor de Y¹ "))
y2 = float(input("Digite o valor de Y² "))

x3 = math.sqrt ((x2-x1)**2 + (y2-y1)**2)

print(" %0.4f" %x3)

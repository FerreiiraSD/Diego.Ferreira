# Exercicio 2 - Calculo de Dias Vividos #

idd= int(input("Qual sua Idade? "))
meses=int(input("Quantos meses desde seu ultimo aniversario? "))
dias=int(input("Que dia é hoje? "))

ia=idd*365
im=meses*30

r=ia+im+dias

print("\nVc tem ",r," dias")

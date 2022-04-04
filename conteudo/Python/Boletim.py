print("BOLETIM SEMESTRAL\n")

print ("UNICSUL - Universidade Cruzeiro do Sul ")
print("Curso: Ciência da Computação")
print ("Aluno: Diego Ferreira da Silva\n")

n1= float(input("Nota final de Programação de Computadores: "))
n2= float(input("Nota final de Aplicações para Internet: "))
n3= float(input("Nota final de Lógica Computacional: "))
n4= float(input("Nota final de Pensamento Computacional: "))

media=(n1+n2+n3+n4)/4

print("\nMedia - ",media, end="")

if media >= 6:
    print(" - Aprovado")
else:
    print(" - Reprovado")

input ("")

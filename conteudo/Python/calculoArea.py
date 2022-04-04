#perimetro = (comprimento*2)+(largura*2)
#area = comprimento*largura

input("Para ser calculado seu frete precisamos calcular\no perimetro e a area de sua emcomenda. Pressione enter")

c=float(input("\nQual comprimento de sua caixa? "))
l=float(input("e a largura?: "))

p=(c*2)+(l*2)
a=c*l

print("\nSeu Perimetro é: ",p, "cm")
print("e a area é: ",a, "cm²")

input("")

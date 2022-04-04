print("Compras acima de R$ 200 terá 20% de desconto")
vc=float(input("Digite o valor de sua compra? R$ "))

cc=(vc-(vc*0.20))

if vc >= 200:
    print("\nParabéns, você ganhou 20%% de Desconto. \nSua compra ficará em R$ %.2f" %cc)

else:
    print("Desculpe, Nosso desconto é para compras acima de R$ 200")

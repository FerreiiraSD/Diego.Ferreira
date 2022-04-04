import javax.swing.JOptionPane;

public class Formas2D {

    public static void main(String[] args) throws Exception {

        int X;

        X = Integer.parseInt(JOptionPane.showInputDialog(   "Selecione a forma geometrica que deseja calcular."+
                                                            "\n"+
                                                            "\n1 - Quadrado"+
                                                            "\n2 - Triangulo"+
                                                            "\n3 - Circulo"+
                                                            "\n4 - Paralelogramo"+
                                                            "\n5 - Retangulo"+
                                                            "\n6 - Pentagono"+
                                                            "\n7 - Trapezio"));

        switch (X) {

            case 1:

                Quadrado Quadrado = new Quadrado();
                Quadrado.cadastroDados();
                Quadrado.calculoAreaQuadrado();
                Quadrado.imprimeDados();

                break;
            
            case 2:

                Triangulo Triangulo = new Triangulo();
                Triangulo.cadastroDados();
                Triangulo.calcularAreaTriangulo();
                Triangulo.imprimeDados();

                break;

            case 3:

                Circulo Circulo = new Circulo();
                Circulo.cadastroDados();
                Circulo.calculoAreaCirculo();
                Circulo.imprimeDados();

                break;

            case 4:

                Paralelogramo Paralelogramo = new Paralelogramo();
                Paralelogramo.cadastroDados();
                Paralelogramo.calculoAreaParalelogramo();
                Paralelogramo.imprimeDados();

                break;

            case 5:

                Retangulo Retangulo = new Retangulo();
                Retangulo.cadastroDados();
                Retangulo.calculoAreaRetangulo();
                Retangulo.imprimeDados();

                break;

            case 6:

                Pentagono Pentagono = new Pentagono();
                Pentagono.cadastroDados();
                Pentagono.calculoAreaPentagono();
                Pentagono.imprimeDados();

                break;

            case 7:

                Trapezio Trapezio = new Trapezio();
                Trapezio.cadastroDados();
                Trapezio.calcularAreaTrapezio();
                Trapezio.imprimeDados();

                break;

            default:
                
        }
        
    }

}    
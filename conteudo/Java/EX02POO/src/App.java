import javax.swing.*;

public class App {

    public static void main(String[] args) throws Exception {

        String mc = JOptionPane.showInputDialog("Marca: ");
        String fab = JOptionPane.showInputDialog("Fabricante: ");
        long cod = Long.parseLong(JOptionPane.showInputDialog("Cod. Barra: "));
        float preco = Float.parseFloat(JOptionPane.showInputDialog("Preço: "));

        produtos pa = new produtos(mc, fab, cod, preco);

        JOptionPane.showMessageDialog(null, "Produto\n\tMarca: "+pa.marca+"\n"+
                                            "\tFabricante: "+ pa.fabricante + "\n"+
                                            "\tCodigo de Barra: "+ pa.cod_barra + "\n"+
                                            "\tPreço: R$"+ pa.preco);
    }
}
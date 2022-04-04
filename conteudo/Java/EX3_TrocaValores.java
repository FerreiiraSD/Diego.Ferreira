import javax.swing.*;

/**
 * EX3_TrocaValores
 */

public class EX3_TrocaValores{

  public static void main(String args[]){
    
    Double v1, v2;       

      v1 = Double.parseDouble (JOptionPane.showInputDialog (null, "Informe o primeiro valor: ", "Calculo Troca de Valores", JOptionPane.INFORMATION_MESSAGE));
      
      v2 = Double.parseDouble (JOptionPane.showInputDialog (null, "Informe o segundo valor: ", "Calculo Troca de Valores", JOptionPane.INFORMATION_MESSAGE));
      
      v1 = v1 + v2;
      v2 = v1 - v2;
      v1 = v1 - v2;
          
      JOptionPane.showMessageDialog (null, "O primeiro valor é: " +v1 , "Calculo Troca de Valores", JOptionPane.INFORMATION_MESSAGE);
      
      JOptionPane.showMessageDialog (null, "O segundo valor é: " +v2 , "Calculo Troca de Valores", JOptionPane.INFORMATION_MESSAGE);
    
  }

}


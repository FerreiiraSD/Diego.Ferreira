import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        new App ();

    }

    public App (){

        ArrayList list = new ArrayList ();

        Random rw = new Random();

        for (int i = 0; i < 7; i++){

            int k = rw.nextInt();

            list.add(k);
            
        }

        inverter (list);

    }

    public void inverter (ArrayList arr){

        ArrayList listInvert = new ArrayList ();

        for (int j = 6; j != -1; j--){

            listInvert.add(arr.get(j));

        }       

        System.out.println("\nLista Original\n" +arr+
                            "\n\nLista Invertida\n" +listInvert);

    }    
}
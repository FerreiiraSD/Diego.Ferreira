public class App {
    
    public static void main(String[] args) throws Exception {

        new App();
    }

    public App(){

        double vet [] = {
            4.3, 6.1, 0.1, 1.9, 2.4, 7.2, 5.5
        };

        int n = vet.length;

        inverter(vet,n);

    }

    public static void inverter(double vet[], int n) {

        double vetInverte[] = new double[n];
        int k = 0;

        for (int i = n-1; i != -1; i--){
            vetInverte[k] = vet[i];
            k++;
        }

        System.out.print("\nVetor Original:  ");

        for (int j = 0 ;j <n ;j++){
            System.out.print(vet[j]+" ");
        }

        System.out.print("\nVetor Invertido: ");

        for (int l = 0 ;l <n ;l++){
            System.out.print(vetInverte[l]+" ");
        }

    }

}
public class EX02ED1 {

    public static void main(String[] args) {
        
        int q=0;
        int n=4;

        for (int i = 0; i<n; i++){
            for (int j = 1; j<n; j++){
                for (int k = 0; k<n; k++){
                    q=q+1;

                    System.out.println(q);                   
                }
            }
        }
    }
}
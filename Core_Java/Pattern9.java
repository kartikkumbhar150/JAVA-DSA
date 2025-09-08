package Core_Java;

public class Pattern9 {
    public static void main(String[] args) {
        int n = 6;
        for(int i = 1; i<= n; i++ ){
            System.out.print(" ");

            for(int j = 1 ; j <= 2*n; j++){

                if(i == 1)
                System.out.print("*");
            }
            System.out.println();
        }    
            
    }
}

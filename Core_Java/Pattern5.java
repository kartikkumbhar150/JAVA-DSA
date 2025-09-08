package Core_Java;

public class Pattern5 {
    public static void main(String[] args) {
        for(int i = 5; i>=1; i--){
            int n = 1;
            for(int j = 1; j <=i ; j++){
                System.out.print(n++);
            }
            System.out.println();
        }
    }
    
}

import java.util.Scanner;

public class App6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do{
            System.out.print("Nhap n");
            n = sc.nextInt();
        }while(n < 0);
        
        if(n == 0){
            System.out.println("n! = 1");
        }
        else{
            int gt = 1;
            for(int i = 1; i <= n; i++){
                gt *= i;
            }
            System.out.println("n! = " + gt);
        }

    }
    
}

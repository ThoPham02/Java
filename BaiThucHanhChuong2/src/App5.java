import java.util.Scanner;

public class App5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        int sum = 0, n;

        while(sum <= 100){
            System.out.print("Tong <= 100. Nhap so: ");
            n = sc.nextInt();
            sum += n;
        }

        System.out.println("Sum = " + sum);
    }
}

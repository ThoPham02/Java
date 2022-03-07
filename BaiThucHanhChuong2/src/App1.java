import java.util.Scanner;

public class App1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: "); int a = sc.nextInt();
        System.out.print("Nhap b: "); int b = sc.nextInt();


        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        if(b == 0){
            System.out.print("Khong ton tai phap chia a / b");
        }
        else{
            System.out.printf("a + b = %f\n", (a * 1.0 / b));
            System.out.println("a % b = " + (a % b));
        }

        if(a == b){
            System.out.println("a = b");
        }
        else if(a > b){
            System.out.println("a > b");
        }
        else System.out.println("a < b");
    }
}

import java.util.Scanner;

public class App8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;

        do{
            System.out.print("Nhap n: ");
            n = sc.nextInt();        
        }while(n <= 0);

        for(int i = 0; i < n; i++){
            System.out.print("Nhap so: ");
            int number = sc.nextInt();
            sum += number;
        }
        System.out.printf("Trung binh cong cua n so la: %f", sum * 1.0 / n);
    }
}

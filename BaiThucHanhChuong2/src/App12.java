import java.util.Scanner;

public class App12 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int soDong, soCot;
        do{
            System.out.print("Nhap so dong: "); soDong = sc.nextInt();
        }while(soDong <= 0);
        do{
            System.out.print("Nhap so cot: "); soCot = sc.nextInt();
        }while(soCot <= 0);

        int a[][] = new int[soDong][soCot];
        for(int i = 0; i < soDong; i++){
            for(int j = 0; j < soCot; j++){
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = sc.nextInt();
            }
        }

        int max = a[0][0];
        for(int i = 0; i < soDong; i++)
            for(int j = 0; j < soCot; j++)
                max = (a[i][j] > max) ? a[i][j] : max;
        
        System.out.println("Phan tu lon nhat cua ma tran la: " + max);
    }
}

import java.util.Scanner;

public class App11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        }while(n <= 0);

        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.printf("Arr[%d] = ", i);
            arr[i] = sc.nextInt();
        }

        System.out.print("Mang ban dau: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("\nMang sau sap xep: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

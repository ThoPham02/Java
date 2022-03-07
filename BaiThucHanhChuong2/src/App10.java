import java.util.Scanner;

public class App10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();
        System.out.print("Nhap ki tu: ");
        String c = sc.next();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c.charAt(0)){
                count ++;
            }
        }
        System.out.print("Co " + count + " ki tu " + c.charAt(0) + " trong chuoi \"" + s + "\"");
    }
}

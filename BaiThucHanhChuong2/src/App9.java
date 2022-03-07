import java.util.Scanner;

public class App9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();

        int demThuong = 0, demHoa = 0, demSo = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                demThuong++;
            }
            else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                demHoa++;
            }
            else if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                demSo++;
            }
        }
        System.out.printf("Co %d chu thuong\nCo %d chu hoa\nCo %d chu so", demThuong, demHoa, demSo);
    }
}

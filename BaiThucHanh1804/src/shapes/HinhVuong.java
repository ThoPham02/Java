package shapes;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    public HinhVuong() {
        ten = "Hinh Vuong";
        dai = 0;
    }

    public void nhapCanh() {
        Scanner sc = new Scanner(System.in);
        dai = sc.nextDouble();
    }
}

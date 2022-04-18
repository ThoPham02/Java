package shapes;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
    public double banKinh;

    public HinhTron() {
        ten = "Hinh Tron";
        banKinh = 0;
    }

    public void nhapBanKinh() {
        Scanner sc = new Scanner(System.in);
        banKinh = sc.nextDouble();
    }

    public void tinhChuVi() {
        chuVi = 2 * PI * banKinh;
    }

    public void tinhDienTich() {
        dienTich = PI * banKinh * banKinh;
    }
}

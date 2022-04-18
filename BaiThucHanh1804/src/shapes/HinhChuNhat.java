package shapes;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    public double dai;
    public double rong;

    public HinhChuNhat() {
        ten = "Hinh Chu Nhat";
        dai = 0;
        rong = 0;
    }

    public void nhapChieuDai() {
        Scanner sc = new Scanner(System.in);
        dai = sc.nextDouble();
    }

    public void nhapChieuRong() {
        Scanner sc = new Scanner(System.in);
        rong = sc.nextDouble();
    }

    public void tinhChuVi() {
        chuVi = 2 * (dai + rong);
    }

    public void tinhDienTich() {
        dienTich = dai * rong;
    }
}

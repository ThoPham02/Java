package shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    public double chieuCao;

    public HinhTru() {
        ten = "Hinh Tru";
        chieuCao = 0;
    }

    public void nhapChieuCao() {
        Scanner sc = new Scanner(System.in);
        chieuCao = sc.nextDouble();
    }

    public void tinhTheTich() {
        theTich = dienTich * chieuCao;
    }
}

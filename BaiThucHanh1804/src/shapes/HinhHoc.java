package shapes;

public class HinhHoc {
    public final double PI = 3.14;
    public String ten;
    public double chuVi;
    public double dienTich;
    public double theTich;

    public HinhHoc() {
        ten ="";
        chuVi = 0;
        dienTich = 0;
        theTich = 0;
    }

    public void xuatTen() {
        System.out.println("Hinh " + ten);
    }

    public void inChuVi() {
        System.out.println("Chu vi hinh " + ten + " la: " + chuVi);
    }

    public void inTheTich() {
        System.out.println("The tich hinh " + ten + " la: " + theTich);
    }

    public void inDienTich() {
        System.out.println("Dien tich hinh " + ten + " la: " + dienTich);
    }
}

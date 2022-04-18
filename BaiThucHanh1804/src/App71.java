import app71.*;

public class App71 {
    public static void main(String[] Args) throws Exception {
        HinhTron hTron = new HinhTron();

        hTron.setBanKinh(5);

        float chuVi = hTron.tinhChuVi();
        float dienTich = hTron.tinhDienTich();
        System.out.println("Chu vi hinh tron: " + chuVi + "; Va dien tich hinh tron: " + dienTich);
    }
}

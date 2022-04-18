import app72.SinhVien;

public class App72 {
    public static void main(String[] Args) throws Exception {
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();

        sv1.setTen("");
        sv2.setTen("Tho");

        sv1.setTuoi(17);
        sv2.setTuoi(20);

        System.out.println("Sinh vien 1 co ten: " + sv1.getTen() + " Tuoi: " + sv1.getTuoi());
        System.out.println("Sinh vien 2 co ten: " + sv2.getTen() + " Tuoi: " + sv2.getTuoi());
    }
}

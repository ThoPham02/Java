import app75.HinhChuNhat;
import app75.HinhHoc;
import app75.HinhTron;

public class App75 {
    public static void main(String[] Args) throws Exception {
        HinhHoc hHoc = new HinhHoc();
        HinhTron hTron1 = new HinhTron();
        HinhTron hTron2 = new HinhTron();
        HinhChuNhat hChuNhat = new HinhChuNhat();

        System.out.println("Co tat ca " + HinhHoc.dem + " hinh tronh vi du");
    }
}

import shapes.*;

public class App54 {
    public static void main(String[] args) throws Exception {
        // Test Hinh Tron
        HinhTron hTron = new HinhTron();
        hTron.nhapBanKinh();
        hTron.tinhChuVi();
        hTron.tinhDienTich();
        hTron.inChuVi();
        hTron.inDienTich();

        // Test Hinh Chu Nhat
        HinhChuNhat hChuNhat = new HinhChuNhat();
        hChuNhat.nhapChieuDai();
        hChuNhat.nhapChieuRong();
        hChuNhat.tinhChuVi();
        hChuNhat.tinhDienTich();
        hChuNhat.inChuVi();
        hChuNhat.inDienTich();

        // Test Hinh Tru
        HinhTru hTru = new HinhTru();
        hTru.nhapBanKinh();
        hTru.nhapChieuCao();
        hTru.tinhChuVi();
        hTru.tinhDienTich();
        hTru.tinhTheTich();
        hTru.inChuVi();
        hTru.inDienTich();
        hTru.inTheTich();

        // Test Hinh Vuong
        HinhVuong hVuong = new HinhVuong();
        hVuong.nhapCanh();
        hVuong.tinhChuVi();
        hVuong.tinhDienTich();
        hVuong.inChuVi();
        hVuong.inDienTich();
    }
}

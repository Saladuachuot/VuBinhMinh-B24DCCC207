class SinhVien {
    private String maSV;
    private String hoTen;
    private int tuoi;
    private static int soLuong = 0;
    public SinhVien () {
        soLuong ++;
    }
    public void setThongTin (String maSV, String hoTen, int tuoi) {
        this.maSV=maSV;
        this.hoTen=hoTen;
        this.tuoi=tuoi;
    }
    public void hienThiThongTin () {
        System.out.println("Mã sinh viên:" + maSV);
        System.out.println("Họ và tên:" + hoTen);
        System.out.println("Tuổi:" + tuoi);
    }
    public static void hienThiSoLuong() {
        System.out.println("Tổng sinh viên:" + soLuong);
    }
}

public class Test2 {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        sv1.setThongTin("B24DCCC207", "Vũ Bình Minh", 18);
        sv1.hienThiThongTin();
        SinhVien.hienThiSoLuong();
    }
}

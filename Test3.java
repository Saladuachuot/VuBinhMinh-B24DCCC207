class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai=chieuDai;
        this.chieuRong=chieuRong;
    }

    public double chuVi() {
        return (chieuDai + chieuRong)*2;
    }

    public double dienTich() {
        return chieuDai*chieuRong;
    }

    public void hienThiThongTin() {
        System.out.println("Chiều dài:" + chieuDai);
        System.out.println("Chiều rộng:" + chieuRong);
        System.out.println("Chu vi:" + chuVi());
        System.out.println("Diện tích:" + dienTich());
    }
}

public class Test3 {
    public static void main(String[] args) {
        HinhChuNhat hcn1 = new HinhChuNhat(1, 2);
        hcn1.hienThiThongTin();
        HinhChuNhat hcn2 = new HinhChuNhat(3,4);
        hcn2.hienThiThongTin();
    }
}

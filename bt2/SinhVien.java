package bt2;

public class SinhVien extends Nguoi {
private double diemTrungBinh;

public SinhVien() {
}
public SinhVien(String maSinhVien, String hoVaTen, int namSinh,double dtb) {
	super(maSinhVien, hoVaTen, namSinh);
	this.diemTrungBinh =dtb;
}
public void setDiemTrungBinh(double diemTrungBinh) {
    this.diemTrungBinh = diemTrungBinh;
}
public double getDiemTrungBinh() {
    return diemTrungBinh;
} 
public void inSinhVien() {
	System.out.println("------------Sinh Viên-----------------");
	System.out.println("Mã Sinh Viên: "+getMaSinhVien());
	System.out.println("Tên Sinh Viên: "+getHoVaTen());
	System.out.println("Năm sinh: "+getNamSinh());
	System.out.println("Điểm Trung Bình: "+getDiemTrungBinh());
	}
}

package bt2;

public class Nguoi {
	 private String maSinhVien;
	    private String hoVaTen;
	    private int namSinh;
	     
	    public Nguoi() {
	    }

	    public Nguoi(String maSinhVien, String hoVaTen, int namSinh) {
	        this.maSinhVien = maSinhVien;
	        this.hoVaTen = hoVaTen;
	        this.namSinh = namSinh;
	    }
	    public void setMaSinhVien(String maSinhVien) {
	        this.maSinhVien = maSinhVien;
	    }
	    public String getMaSinhVien() {
	        return maSinhVien;
	    }
	    public void setHoVaTen(String hoVaTen) {
	        this.hoVaTen = hoVaTen;
	    }
	    public String getHoVaTen() {
	        return hoVaTen;
	    }
	    public void setNamSinh(int namSinh) {
	        this.namSinh = namSinh;
	    }
	    public int getNamSinh() {
	        return namSinh;
	    }
	    public void inNguoi() {
			System.out.println("Sinh Viên: ");
			System.out.println("Mã Sinh Viên:"+getMaSinhVien());
			System.out.println("Tên Sinh Viên:"+getHoVaTen());
			System.out.println("Năm sinh "+getNamSinh());
			}

}

package bt2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Arra.SV;
import bt.Sach;

public class QuanLySinhVien {
	private ArrayList<SinhVien> sinhvien = new ArrayList<SinhVien>();
	private boolean removeIf;
	
	public void themSV(SinhVien sv) {
		sinhvien.add(sv);
	}
	public void inDanhSach() {
		for(SinhVien sv : sinhvien ) {
			sv.inSinhVien();
		}
	}
	public boolean kiemtrarong() {
		return sinhvien.isEmpty();
	}
	public int sosinhviendanhsach() {
		return sinhvien.size();
	}
	public boolean kiemtramasinhvien(String maSinhvien) {
		for (SinhVien sv : sinhvien) {
			if(sv.getMaSinhVien().equals(maSinhvien)) {
				return true;
			}
		}
		return false;
	}
	public int demSinhVienDiemTrungBinhDuoi5() {
        int count = 0;
        for (SinhVien sv : sinhvien) {
            if (sv.getDiemTrungBinh() < 5) {
                count++;
            }
        }
        return count;
    }
	 public void inSinhVienTuoi25TroLen(int namHienTai) {
	        for (SinhVien sv : sinhvien) {
	            int tuoi = namHienTai - sv.getNamSinh();
	            if (tuoi >= 25) {
	                System.out.println(sv);
	            }
	        }
	    } public double tinhTuoiTrungBinh(int namHienTai) {
	        int tongTuoi = 0;
	        for (SinhVien sv :sinhvien) {
	            int tuoi = namHienTai - sv.getNamSinh();
	            tongTuoi += tuoi;
	        }
	        return (double) tongTuoi /sinhvien.size();
	    }

	    public void xoaSinhVien(String maSinhVien) {
	    	  for (int i = 0; i < sinhvien.size(); i++) {
		            if (sinhvien.get(i).getMaSinhVien().equals(maSinhVien)) {
		                sinhvien.remove(i);
		                break;
	    }
	    	  }}

	    public void timKiemSinhVienTheoTen(String ten) {
	        for (SinhVien sv : sinhvien) {
	            if (sv.getHoVaTen().toLowerCase().contains(ten.toLowerCase())) {
	                System.out.println(sv);
	            }
	        }
	    } public boolean kiemTraSapXepTangDan() {
	        for (int i = 0; i < sinhvien.size() - 1; i++) {
	            if (sinhvien.get(i).getDiemTrungBinh() > sinhvien.get(i + 1).getDiemTrungBinh()) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public void sapXepTangDan() {
	        Collections.sort(sinhvien, new Comparator<SinhVien>() {
			
	            @Override
	            public int compare(SinhVien s1, SinhVien s2) {
	                return Double.compare(s1.getDiemTrungBinh(), s2.getDiemTrungBinh());
	            }
	        });
	    }
}

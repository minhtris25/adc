package bt2;

import java.util.Scanner;

public class mana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuanLySinhVien qlsv = new QuanLySinhVien();
		Scanner sc = new Scanner(System.in);
		int chon;
		 
		do {
			 System.out.println("---------------MENU---------------");
            System.out.println("1. Thêm sinh viên vào danh sách");
            System.out.println("2. In danh sách sinh viên ra màn hình");
            System.out.println("3. Kiểm tra danh sách có rỗng hay không");
            System.out.println("4. Lấy ra số sinh viên có trong danh sách");
            System.out.println("5. Kiểm tra sinh viên có tồn tại trong danh sách hay không");
            System.out.println("6. Đếm số sinh viên có điểm trung bình <5");
            System.out.println("7. In sinh viên có tuổi >= 25");
            System.out.println("8. Tính tuổi trung bình của sinh viên");
            System.out.println("9. Xóa sinh viên khỏi danh sách");
            System.out.println("10. Tìm kiếm sinh viên theo tên");
            System.out.println("11. Kiểm tra danh sách có sắp xếp tăng dần hay không");
            System.out.println("12. Sắp xếp danh sách theo điểm trung bình tăng dần");
            System.out.println("13. Thoát");
            System.out.print("Chọn: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Nhập mã sinh viên: ");
                    String maSV = sc.nextLine();
                    System.out.print("Nhập họ và tên: ");
                    String hoTen = sc.nextLine();
                    System.out.print("Nhập năm sinh: ");
                    int namSinh = sc.nextInt();
                    System.out.print("Nhập điểm trung bình: ");
                    double diemTB = sc.nextDouble();
                    SinhVien sv = new SinhVien(maSV, hoTen, namSinh, diemTB);
                    qlsv.themSV(sv);
                    break;
                case 2:
                    qlsv.inDanhSach();;
                    break;
                case 3:
                    System.out.println("Danh sách có rỗng: " + qlsv.kiemtrarong());
                    break;
                case 4:
                    System.out.println("Số lượng sinh viên: " + qlsv.sosinhviendanhsach());
                    break;
                case 5:
                    System.out.print("Nhập mã sinh viên cần kiểm tra: ");
                    String maSinhVienKiemTra = sc.nextLine();
                    System.out.println("Sinh viên tồn tại: " + qlsv.kiemtramasinhvien(maSinhVienKiemTra));
                    break;
                case 6:
                    System.out.println("Số sinh viên có điểm trung bình < 5: " + qlsv.demSinhVienDiemTrungBinhDuoi5());
                    break;
                case 7:
                    System.out.print("Nhập năm hiện tại: ");
                    int namHienTai = sc.nextInt();
                    qlsv.inSinhVienTuoi25TroLen(namHienTai);
                    break;
                case 8:
                    System.out.print("Nhập năm hiện tại: ");
                    namHienTai = sc.nextInt();
                    System.out.println("Tuổi trung bình của sinh viên: " + qlsv.tinhTuoiTrungBinh(namHienTai));
                    break;
                case 9:
                    System.out.print("Nhập mã sinh viên cần xóa: ");
                    String maSinhVienXoa = sc.nextLine();
                    qlsv.xoaSinhVien(maSinhVienXoa);
                    System.out.println("Đã xóa sinh viên.");
                    break;
                case 10:
                    System.out.print("Nhập tên cần tìm: ");
                    String tenTimKiem = sc.nextLine();
                    qlsv.timKiemSinhVienTheoTen(tenTimKiem);
                    break;
                case 11:
                    System.out.println("Danh sách có sắp xếp tăng dần theo điểm trung bình: " + qlsv.kiemTraSapXepTangDan());
                    break;
                case 12:
                    qlsv.sapXepTangDan();
                    System.out.println("Đã sắp xếp danh sách theo điểm trung bình tăng dần.");
                    break;
                case 13:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        } while (chon != 13);
    }
}

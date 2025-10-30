package quanly;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        IQuanLyNguoiDung nguoiDung = new QuanLyNguoiDungImpl();


        System.out.println("1.Thêm người dùng");
        System.out.println("2.Hiện thị thông tin");
        System.out.println("3.Tìm kiếm theo tên");
        System.out.println("4.Xóa người dùng");
        System.out.println("5.Cập nhật người dùng");
        System.out.println("6.Kết quả hiện thị");

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhập vào lựa chọn");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("--------------thêm người dùng-----------------");
                    nguoiDung.themNguoiDung(new GiangVien("1", "a", "b", 28, "h", "o", 12));
                    nguoiDung.themNguoiDung(new Student("2", "b", "j", 21, "t", "k", 9));
                    nguoiDung.hienThiDanhSach();
                    return;

                case 2:
                    System.out.println("-------------hiện thị danh sách-------------");
                    nguoiDung.hienThiDanhSach();
                case 3:
                    System.out.println("--------------Hiện thị thông tin-------------");
                    nguoiDung.hienThiThongTin("2");

                case 4:
                    System.out.println("--------------Tìm kiếm theo tên----------------");
                    nguoiDung.searchUser("a");

                case 5:
                    System.out.println("--------------Delete------------------------");
                    nguoiDung.deleteUser("1");

                case 6:
                    System.out.println("----------------Cập nhật----------------------");
                    nguoiDung.updateUser("2");

                case 7:
                    System.out.println("--------------Kết quả hiện thị-----------------");
                    nguoiDung.hienThiDanhSach();

                default:
                    System.out.println("Lỗi lựa chọn!!!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
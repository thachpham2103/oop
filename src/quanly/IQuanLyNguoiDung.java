package quanly;

public interface IQuanLyNguoiDung {
    void themNguoiDung(Personal personal);
    void hienThiDanhSach();
    void hienThiThongTin(String id);
    void deleteUser(String id);
    void searchUser(String name);
    void updateUser(String id);
}

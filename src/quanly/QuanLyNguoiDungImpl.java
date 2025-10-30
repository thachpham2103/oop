package quanly;

import java.util.ArrayList;
import java.util.List;

public class QuanLyNguoiDungImpl implements IQuanLyNguoiDung {

    private List<Personal> danhSachNguoiDung= new ArrayList<>();

    public QuanLyNguoiDungImpl(){

    }


    public QuanLyNguoiDungImpl(List<Personal> danhSachNguoiDung) {

        this.danhSachNguoiDung = danhSachNguoiDung;
    }

    /**
     * thêm người dùng
     */
    @Override
    public void themNguoiDung(Personal personal) {
        danhSachNguoiDung.add(personal);
        System.out.println("Đã thêm người dùng"+ personal.getName()+"thành công!");
    }

    /**
     * hiện thị danh sách
     */
    @Override
    public void hienThiDanhSach() {
          if(danhSachNguoiDung.isEmpty()){
              System.out.println("Danh sách rỗng");
              return;
          }
          for(Personal user: danhSachNguoiDung){
              user.hienThiThongTin();
          }
    }

    /**
     * hiện thị thông tin người dùng
     */

    @Override
    public void hienThiThongTin(String id) {
        try {
            for (Personal user : danhSachNguoiDung) {
                if (user.getId().equalsIgnoreCase(id)) {
                    user.hienThiThongTin();
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteUser(String id) {

        boolean remove= danhSachNguoiDung.removeIf(user->user.getId().equalsIgnoreCase(id));

        if(remove){
            System.out.println("đã xóa người dùng có id"+id);
        }else {
            System.out.println("Lỗi");
        }
    }

    @Override
    public void searchUser(String name) {

        boolean found= false;
        for(Personal user:danhSachNguoiDung){
            if(user.getName().toLowerCase().contains(name.toLowerCase())){
                user.hienThiThongTin();
                found=true;
            }
        }
        if(!found){
            System.out.println("Lỗi!");
        }

    }

    @Override
    public void updateUser(String id) {

        for(Personal user: danhSachNguoiDung){
            if(user.getId().equalsIgnoreCase(id)){
                user.nhap();
                user.hienThiThongTin();
            }
            else {
                System.out.println("Lỗi không tìm thấy!");
            }
        }
    }
}

package quanly;

import java.util.Scanner;

public class GiangVien extends Personal {


    private String khoa;
    private double luong;

    public GiangVien(){

    }

    public GiangVien(String id, String name, String email, int age, String phoneNumber, String khoa, double luong) {
        super(id, name, email, age, phoneNumber);
        this.khoa = khoa;
        this.luong = luong;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao khoa:");
        khoa=sc.nextLine();
        System.out.println("nhap vao luong:");
        luong=sc.nextDouble();
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("id"+getId());
        System.out.println("name"+ getName());
        System.out.println("email"+getEmail());
        System.out.println("age"+getAge());
        System.out.println("phoneNumber"+getPhoneNumber());
        System.out.println("khoa"+khoa);
        System.out.println("luong"+luong);
    }
}

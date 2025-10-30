package quanly;

import java.util.Scanner;

public class Student extends Personal {

    private String chuyenNganh;
    private double diemTb;

    public Student(){

    }

    public Student(String id, String name, String email, int age, String phoneNumber, String chuyenNganh, double diemTb) {
        super(id, name, email, age, phoneNumber);
        this.chuyenNganh = chuyenNganh;
        this.diemTb = diemTb;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public double getDiemTb() {
        return diemTb;
    }

    public void setDiemTb(double diemTb) {
        this.diemTb = diemTb;
    }

    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao chuyenNganh:");
        chuyenNganh=sc.nextLine();
        System.out.println("nhap vao diemTb:");
        diemTb=sc.nextDouble();
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("id"+getId());
        System.out.println("name"+ getName());
        System.out.println("email"+getEmail());
        System.out.println("age"+getAge());
        System.out.println("phoneNumber"+getPhoneNumber());
        System.out.println("chuyenNganh:"+ chuyenNganh);
        System.out.println("diemTb"+ diemTb);
    }

}

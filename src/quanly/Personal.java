package quanly;

import java.util.Scanner;

public abstract class Personal {

    protected String id;
    protected String name;
    protected String email;
    protected int age;
    protected String phoneNumber;

    public Personal(){

    }

    public Personal(String id, String name, String email,int age, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age=age;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public abstract void hienThiThongTin();

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao id:");
        id=sc.nextLine();
        System.out.println("nhap vao name:");
        name=sc.nextLine();
        System.out.println("nhap vao email:");
        email=sc.nextLine();
        System.out.println("nhap vao age:");
        age=sc.nextInt();
        sc.nextLine();
        System.out.println("nhap vao phoneMunber:");
        phoneNumber=sc.nextLine();
    }

}

package entity;

import java.util.Scanner;

public class Student {
    public int studentId ;
    public static int Auto_studentId = 10000;
    public String name;
    public String address;
    public int numberphone;
    public String group;

    public Student(int studentId, String name, String address, int numberphone, String group) {
        this.studentId = studentId;
        this.name = name;
        this.address = address;
        this.numberphone = numberphone;
        this.group = group;
    }

    public Student() {

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberphone() {
        return numberphone;
    }

    public void setNumberphone(int numberphone) {
        this.numberphone = numberphone;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void inputinfo(){
        System.out.println("Nhap ma sinh vien: ");
        this.studentId = Auto_studentId++;
        this.setStudentId(new Scanner(System.in).nextInt());
        System.out.println("Nhap Ten sinh vien:");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhap so dien thoai cua ban: ");
        this.setNumberphone(new Scanner(System.in).nextInt());
        System.out.println("Nhap dia chi cua ban: ");
        this.setAddress(new Scanner(System.in).nextLine());
        System.out.println("Nhap lop cua ban: ");
        this.setGroup(new Scanner(System.in).nextLine());
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", numberphone=" + numberphone +
                ", group='" + group + '\'' +
                '}';
    }
}


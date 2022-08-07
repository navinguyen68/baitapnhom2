package main;

import entity.ScoreDtail;
import entity.Student;
import entity.SubjectCl;
import logicHandle.MangeSystem;
import logicHandle.StudentSystem;
import logicHandle.SubjectSystem;

import java.util.Scanner;

public class MainRun {
    public static Student[] students = new Student[100];
    public static SubjectCl[] subjectCls = new SubjectCl[100];
    public static entity.Score[] scores = new entity.Score[100];
    public void main(String args) {
        menu();
    }
    public static void menu() {
        boolean isExit = false;
        System.out.println("---Chon chuc nang ---");
        System.out.println("1. Nhap vao sinh vien moi");
        System.out.println("2. Danh sach sinh vien sau khi nhap");
        System.out.println("3. Nhap vao mon hoc moi");
        System.out.println("4. Danh sach mon hoc moi");
        System.out.println("5. Nhap diem vao cho sinh vien ");
        System.out.println("6. in ra danh sach sau khi nhap diem");
        System.out.println("7. Sap xep danh sach theo ho ten sinh vien");
        System.out.println("8. Tinh diem tong ket chung cho moi sinh vien");
        System.out.println("9. Thoat");
        int choice = 0;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 9) {
                break;
            }
            System.out.println("Lua chon khong hop le, vui long chon lai");
        } while (true);
        switch (choice){
            case 1:
                StudentSystem.inputNewStudent();
                break;
            case 2:
                StudentSystem.showStudent();
                break;
            case 3:
                SubjectSystem.inputNewSubject();
                break;
            case 4:
                SubjectSystem.showSubject();
                break;
            case 5:
                MangeSystem.inputScore();
                break;
            case 6:
                MangeSystem.showStudentscore();
                break;
            case 7:
                MangeSystem.sortName();
                break;
            case 8:
                System.exit(0);
                isExit = true;


        }

    }
}

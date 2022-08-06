package main;

import entity.ScoreDtail;
import entity.Student;
import entity.SubjectCl;
import logicHandle.StudentSystem;
import logicHandle.SubjectSystem;

import java.util.Scanner;

public class MainRun {
    public static Student[] students = new Student[100];
    public static SubjectCl[] subjectCls = new SubjectCl[100];
    public static ScoreDtail[] scoreDtails = new ScoreDtail[100];
    public void main(String args) {
        menu();
    }
    public static void menu() {
        System.out.println("---Chon chuc nang ---");
        System.out.println("1. Nhap vao sinh vien moi");
        System.out.println("2. Danh sach sinh vien sau khi nhap");
        System.out.println("3. Nhap vao mon hoc moi");
        System.out.println("4. Danh sach mon hoc moi");
        System.out.println("5. Nhap diem vao cho sinh vien ");
        System.out.println("6. in ra danh sach sau khi nhap diem");
        System.out.println("7. Sap xep danh sach theo ho ten sinh vien");
        System.out.println("8. Sap xep danh sach theo ten moc hoc");
        System.out.println("9. Tinh diem tong ket chung cho moi sinh vien");
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

        }

    }
}

package logicHandle;

import entity.Student;
import main.MainRun;

import java.util.Scanner;

public class StudentSystem {
    public static void showStudent(){
        for (int i = 0; i< MainRun.students.length; i++){
            if ( MainRun.students[i] == null) {
                continue;
            }
            System.out.println(MainRun.students[i]);
        }
    }
    public static void inputNewStudent(){
        System.out.println("Xin moi nhap so luong sinh vien muon them vao:");
        int studentNumber = new Scanner(System.in).nextInt();
        for ( int i =0; i < studentNumber ; i++) {
            Student student = new Student();
            student.inputinfo();
            saveStudentinfo(student);

        }
    }
    public static void saveStudentinfo(Student student){
        for (int j=0; j< MainRun.students.length; j++) {
            if (MainRun.students[j] == null) {
                MainRun.students[j] = student;
                return;
            }
        }
    }
    public static boolean isEmptyStudent(){
        for (int i =0; i< MainRun.students.length; i++){
            if(MainRun.students[i] != null) {
                return false;
            }
        }
        return true;
    }
}

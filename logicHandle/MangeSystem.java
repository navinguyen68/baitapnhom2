package logicHandle;

import entity.Score;
import entity.ScoreDtail;
import entity.Student;
import main.MainRun;

import java.util.Scanner;

public class MangeSystem {

    public static void sortName() {
        System.out.println("Nhap lua chon cua ban:");
        System.out.println("1. Sap xep danh sach bang diem theo ten hoc sinh");
        System.out.println("2. Sap xep theo diem trung binh");
        int choose = 0;
        do {
            choose = new Scanner(System.in).nextInt();
            if (choose == 1 || choose == 2) {
                break;
            }
            System.out.println("Xin moi nhap lai. Lua chon khong hop le!!!");
        } while (true);
        if (choose == 1) {
            for (int i = 0; i < MainRun.scoreDtails.length; i++) {
                if (MainRun.scoreDtails[i] == null) {
                    continue;
                }
                for (int j = i + 1; j < MainRun.scoreDtails.length; j++) {
                    if (MainRun.scoreDtails[j] == null) {
                        continue;
                    }
                    if (MainRun.scoreDtails[i].getStudents().getName().compareTo(MainRun.scoreDtails[j].getStudents().getName()) > 0) {
                        ScoreDtail temp = MainRun.scoreDtails[i];
                        MainRun.scoreDtails[i] = MainRun.scoreDtails[j];
                        MainRun.scoreDtails[j] = temp;
                    }
                }
            }
            showScore();
        } else if (choose ==2 ) {

        }
    }
    public static void searchStudent() {
        System.out.print("Nhap ten sinh vien ban muon tim kiem: ");
        String keyword = new Scanner(System.in).nextLine();
        for (int i = 0; i < MainRun.scoreDtails.length; i++) {
            if (MainRun.scoreDtails[i] != null) {
                System.out.println(MainRun.scoreDtails[i]);
            }
        }
    }
    public static void showScore() {
    for (int i = 0; i < MainRun.scoreDtails.length; i++){
        if(MainRun.scoreDtails[i] != null){
            System.out.println(MainRun.scoreDtails[i]);
        }
    }
    }
    public static void scoreSubject(){
        if (SubjectSystem.isEmptySubject() || (StudentSystem.isEmptyStudent())){
            System.out.println("Can thuc hien nhap sinh vien va mon hoc");
            return;
        }
        System.out.println("Nhap vao so sinh vien dang ky mon hoc: ");
        int studentNumber = new Scanner(System.in).nextInt();
        for (int i =0; i< studentNumber; i++){
            Student student = inputStudentinfo(i);
            Score[] scores = inputScore();
            ScoreDtail scoreDtail = new ScoreDtail(student,scores);
            saveScoreDtail(scoreDtail);

        }
    }
    public static void saveScoreDtail(ScoreDtail scoreDtail){
        for (int j = 0; j < MainRun.scoreDtails.length; j++) {
            if (MainRun.scoreDtails[j] == null ){
                MainRun.scoreDtails[j] = scoreDtail;
                break;
            }
        }
    }
    public static void Score[] inputSubjectScore() {
        System.out.println("Nhap so luong mon hoc ma sinh vien dang ky: ");
        int subjectQuanity = -1;
        do{
            subjectQuanity = new Scanner(System.in).nextInt();
            if (subjectQuanity > 0 && subjectQuanity <= 100){
                break;
            }
            System.out.println("Ban chi duoc dang ky duoi 100 mon hoc");
        } while (true);
        // nhap mon hoc va so luong   muon dang ky hoc
        entity.Score[] scores = new Score[subjectQuanity];

    }
}



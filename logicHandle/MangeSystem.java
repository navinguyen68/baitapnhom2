package logicHandle;

import entity.Score;
import entity.ScoreDtail;
import entity.Student;
import entity.SubjectCl;
import main.MainRun;

import java.util.Scanner;

public class MangeSystem {

    public static void sortName() {
        System.out.println("Nhap lua chon cua ban:");
        System.out.println("1. Sap xep bang diem theo ten hoc sinh");
        System.out.println("2. Sap xep bang diem theo ten mon hoc");
        int choose = 0;
        do {
            choose = new Scanner(System.in).nextInt();
            if (choose == 1 || choose == 2) {
                break;
            }
            System.out.println("Xin moi nhap lai. Lua chon khong hop le!!!");
        } while (true);
        if (choose == 1) {
            for (int i = 0; i < MainRun.scores.length; i++) {
                if (MainRun.scores[i] == null) {
                    continue;
                }
                for (int j = i + 1; j < MainRun.scores.length; j++) {
                    if (MainRun.scores[j] == null) {
                        continue;
                    }
                    if (MainRun.scores[i].getStudent().getName().compareTo(MainRun.scores[j].getStudent().getName()) > 0) {
                        Score temp = MainRun.scores[i];
                        MainRun.scores[i] = MainRun.scores[j];
                        MainRun.scores[j] = temp;
                    }
                }
            }
            showStudentscore();
        } else if (choose ==2 ) {

        }
    }
    public static void findStudent() {
        System.out.print("Nhap ten sinh vien ban muon tim kiem: ");
        String findname = new Scanner(System.in).nextLine();
        for (int i = 0; i < MainRun.scores.length; i++) {
            if (MainRun.scores[i] != null && MainRun.scores[i].getStudent().getName().toLowerCase().contains(findname.toLowerCase())) {
                System.out.println(MainRun.scores[i]);
            }
        }
    }
    public static void showStudentscore() {
    for (int i = 0; i < MainRun.scores.length; i++){
        if(MainRun.scores[i] != null){
            System.out.println(MainRun.scores[i]);
        }
    }
    }
    public static void scoreSubject() {
        if (SubjectSystem.isEmptySubject() || (StudentSystem.isEmptyStudent())) {
            System.out.println("Can thuc hien nhap sinh vien va mon sinh vien thi");
            return;
        }
        System.out.println("Nhap vao so sinh vien dang ky thi mon : ");
        int studentNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < studentNumber; i++) {
            // nhap so sinh vien dang ky mon hoc
            Student student = inputStudentinfo(i);
            //nhap danh sach diem thi mon hoc ma sinh vien thi
            ScoreDtail[] scoreDtails = inputScore();
            Score score = new Score(student, scoreDtails );
            saveScoreDtail(score);


        }
    }
    public static void saveScoreDtail(Score scoreDtail){
        for (int j = 0; j < MainRun.scores.length; j++) {
            if (MainRun.scores[j] == null ){
                MainRun.scores[j] = scoreDtail;
                break;
            }
        }
    }
    public static ScoreDtail[] inputScore() {
        System.out.println("Nhap so luong mon hoc dang ky thi : ");
        int subjectQuanity = -1;
        do {
            subjectQuanity = new Scanner(System.in).nextInt();
            if (subjectQuanity > 0 && subjectQuanity <= 100) {
                break;
            }
            System.out.println("Ban chi duoc dang ky thi duoi 100 mon hoc");
        } while (true);
        // nhap mon hoc va so luong  muon dang ky hoc
        entity.Score[] scoren = new Score[subjectQuanity];
        for (int j = 0; j < subjectQuanity; j++) {
            System.out.println("Nhap ma mon hoc thu" + (j + 1) + "ma sinh vien  dang ky: ");
            SubjectCl subjectCl = null;
            do {
                int subjectId = new Scanner(System.in).nextInt();
                for (int k = 0; k < subjectQuanity; k++) {
                    if (MainRun.subjectCls[k] != null) {
                        subjectCl = MainRun.subjectCls[k];
                        break;
                    }
                }
                if (subjectCl != null) {
                    break;
                }
                System.out.println("Khong tim thay diem thi mon hoc");
            } while (true);
            return new ScoreDtail[0];
        }

        return new ScoreDtail[0];
    }

    public static Student inputStudentinfo(int supcription) {
        System.out.print("Nhap vao ma sinh vien thu " + (supcription +1) + "muon dang ky thi mon hoc: ");
        Student student = null ;
        do {
            int stuId = new Scanner(System.in).nextInt();
            for (int j = 0 ; j < MainRun.students.length; j++){
               if(MainRun.students[j] != null && MainRun.students[j].getStudentId() == stuId){
                   student = MainRun.students[j];
                   break;

                }
            }
            if (student != null) {
                break;
            }
            System.out.print("Khong tim thay ma sinh vien vui long nhap lai: ");
        } while (true);
        return student;
    }
}




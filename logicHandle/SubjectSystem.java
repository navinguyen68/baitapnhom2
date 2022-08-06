package logicHandle;

import entity.SubjectCl;
import main.MainRun;

import java.util.Scanner;

public class SubjectSystem {
    public static void showSubject(){
        for (int i = 0 ; i < MainRun.subjectCls.length; i++) {
            if ( MainRun.students[i] == null ){
                continue;
            }
            System.out.println(MainRun.students[i]);
        }
    }
    public static void inputNewSubject(){
        System.out.println("XIn moi nhap so luong mon hoc moi muon them vao: ");
        int newSubject = new Scanner(System.in).nextInt();
        for ( int i = 0; i < newSubject; i ++  ) {
            SubjectCl subjectCl = new SubjectCl();
            subjectCl.inputSubject();
            saveSubjectinfo(subjectCl);

        }
    }
    public static void saveSubjectinfo(SubjectCl subjectCl) {
        for (int j = 0; j < MainRun.subjectCls.length; j++) {
            if (MainRun.subjectCls[j] == null) {
                MainRun.subjectCls[j] = subjectCl;
                return;
            }
        }
    }
    public static boolean isEmptySubject(){
        for (int i =0; i < MainRun.subjectCls.length; i++){
            if(MainRun.subjectCls[i] != null) {
                return false;
            }
        }
        return true;
    }
}
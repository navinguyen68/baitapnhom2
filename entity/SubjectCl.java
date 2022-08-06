package entity;

import type.SubjectType;

import java.util.Scanner;

public class SubjectCl {
    public int id;
    public static int Auto_Id;
    public String sjname;
    public int unitofStudy;
    public SubjectType subjectType;

    public SubjectCl(int id, String sjname, int unitofStudy, SubjectType subjectType) {
        this.id = id;
        this.sjname = sjname;
        this.unitofStudy = unitofStudy;
        this.subjectType = subjectType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSjname() {
        return sjname;
    }

    public void setSjname(String sjname) {
        this.sjname = sjname;
    }

    public int getUnitofStudy() {
        return unitofStudy;
    }

    public void setUnitofStudy(int unitofStudy) {
        this.unitofStudy = unitofStudy;
    }

    public SubjectType getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(SubjectType subjectType) {
        this.subjectType = subjectType;
    }

    public SubjectType getType() {
        return subjectType;
    }

    public void setType(SubjectType subjectType) {
        this.subjectType = subjectType;
    }

    public void inputSubject() {
        System.out.println("Nhap ma mon hoc: ");
        this.id = Auto_Id++;
        this.setId(new Scanner(System.in).nextInt());
        System.out.println("Nhap ten mon hoc: ");
        this.sjname = new Scanner(System.in).nextLine();
        System.out.println("Nhap so son vi hoc trinh: ");
        this.unitofStudy = new Scanner(System.in).nextInt();
        System.out.println("Nhap loai mon hoc: ");
        System.out.println("Dai cuong");
        System.out.println("Co so nganh");
        System.out.println("Chuyen nganh");
        int inputSbType = 0;
        do {
            inputSbType = new Scanner(System.in).nextInt();
            if (inputSbType >= 1 && inputSbType <= 3) {
                break;
            }
            System.out.println("Lua cho khong hop le, vui long chon 1 trong 3 loại moc hoc: ");
        } while (true);
        switch (inputSbType) {
            case 1:
                this.setType(SubjectType.DC);
                break;
            case 2:
                this.setType(SubjectType.CSN);
                break;
            case 3:
                this.setType(SubjectType.CN);
        }
    }
}


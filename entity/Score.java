package entity;

public class Score {

    private SubjectCl subjectCls;
    public int number; //diemso
    public int averageScore; //diem trung binh

    public Score(SubjectCl subjectCls, int number, int averageScore) {
        this.subjectCls = subjectCls;
        this.number = number;
        this.averageScore = averageScore;
    }

    public SubjectCl getSubjectCls() {
        return subjectCls;
    }

    public void setSubjectCls(SubjectCl subjectCls) {
        this.subjectCls = subjectCls;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Score{" +
                "subjectCls=" + subjectCls +
                ", number=" + number +
                ", averageScore=" + averageScore +
                '}';
    }
}
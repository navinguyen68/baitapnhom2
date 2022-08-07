package entity;

import java.util.Arrays;

public class Score extends InputScore {
    private Student student;

    private ScoreDtail[] scoreDtails;

    public Score(Student student, ScoreDtail[] scoreDtails) {
        this.student = student;
        this.scoreDtails = scoreDtails;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public ScoreDtail[] getScoreDtails() {
        return scoreDtails;
    }

    public void setScoreDtails(ScoreDtail[] scoreDtails) {
        this.scoreDtails = scoreDtails;
    }

    @Override
    public String toString() {
        return "Score{" +
                "student=" + student +
                ", scoreDtails=" + Arrays.toString(scoreDtails) +
                '}';
    }

    public Score() {
    }
    public void inputScoreSubject(){

    }
}

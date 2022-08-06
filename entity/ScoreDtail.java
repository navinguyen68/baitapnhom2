package entity;

import java.util.Arrays;

public class ScoreDtail {
    private Student students;
    private ScoreDtail[] scoreDtails;

    public ScoreDtail(Student students, ScoreDtail[] scoreDtails) {
        this.students = students;
        this.scoreDtails = scoreDtails;
    }

    public ScoreDtail(Student student, Score[] scores) {
    }

    public Student getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }

    public ScoreDtail[] getScoreDtails() {
        return scoreDtails;
    }

    public void setScoreDtails(ScoreDtail[] scoreDtails) {
        this.scoreDtails = scoreDtails;
    }

    @Override
    public String toString() {
        return "ScoreDtail{" +
                "students=" + students +
                ", scoreDtails=" + Arrays.toString(scoreDtails) +
                '}';
    }


}
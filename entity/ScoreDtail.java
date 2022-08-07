package entity;

import java.util.Arrays;

public class ScoreDtail extends InputScore{
    private SubjectCl scoreDtails;
    private int scoreNum;

    public ScoreDtail() {
    }

    public ScoreDtail(SubjectCl scoreDtails, int scoreNum) {
        this.scoreDtails = scoreDtails;
        this.scoreNum = scoreNum;
    }

    public SubjectCl getScoreDtails() {
        return scoreDtails;
    }

    public void setScoreDtails(SubjectCl scoreDtails) {
        this.scoreDtails = scoreDtails;
    }

    public int getScoreNum() {
        return scoreNum;
    }

    public void setScoreNum(int scoreNum) {
        this.scoreNum = scoreNum;
    }

    @Override
    public String toString() {
        return "ScoreDtail{" +
                "scoreDtails=" + scoreDtails +
                ", scoreNum=" + scoreNum +
                '}';
    }
}



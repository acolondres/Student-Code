package com.techelevator;

public class HomeworkAssignment {
    //attributes
    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;
    private String letterGrade;

    //getters and setters
    public int getEarnedMarks() {
        return earnedMarks;
    }

    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    //constructors
    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }
    //grading

    public void calculateGrade() {
        double percentage = (earnedMarks/possibleMarks) * 100;
        if (percentage >= 90) {
            this.letterGrade = "A";
        } else if (percentage >= 80) {
            this.letterGrade = "B";
        } else if (percentage >= 70) {
            this.letterGrade = "C";
        } else if (percentage >= 60) {
            this.letterGrade = "D";
        } else {
            this.letterGrade = "F";
        }
    }
}
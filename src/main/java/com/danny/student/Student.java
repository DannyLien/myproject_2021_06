package com.danny.student;

public class Student {
    String name;
    int english;
    int math;
    int average;
    char grading;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public Student(String name, int english, int math, int average, char grading) {
        this(name, english, math);
        this.average = average;
        this.grading = grading;
    }

    @Override
    public String toString() {
        return name + "\t" + english + "\t" + math + "\t" +
                average + "\t" + grading;
    }

    public void printAll(){
        System.out.println(name + "\t" + english + "\t" + math + "\t" +
                average + "\t" + grading);
    }

    public int getAverage() {
        return (english + math) / 2;
    }

    public char getGrading() {
        char grading = 'F';
        switch (getAverage() / 10) {
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            default:
                grading = 'F';
                break;
        }
        return grading;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }
}

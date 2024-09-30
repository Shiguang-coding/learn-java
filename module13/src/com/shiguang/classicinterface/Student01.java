package com.shiguang.classicinterface;

public class Student01 implements Comparable{
    private String name;
    private int score;

    public Student01() {

    }

    public Student01(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student01{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    /*
      this:代表students[i]
      o:代表students[i+1]

      如果students[i].getScore()-students[i+1].getScore()>0
         证明数组中的前面一个对象比后面一个对象的分数高
     */
    @Override
    public int compareTo(Object o) {
        Student01 s = (Student01) o;
        return this.getScore()- s.getScore();
    }
}
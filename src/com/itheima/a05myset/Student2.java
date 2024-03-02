package com.itheima.a05myset;

public class Student2 implements Comparable<Student2>{
    private String name;
    private int age;
    private int chineseScore;
    private int mathScore;
    private int englishScore;


    public Student2() {
    }

    public Student2(String name, int age, int chineseScore, int mathScore, int englishScore) {
        this.name = name;
        this.age = age;
        this.chineseScore = chineseScore;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return chineseScore
     */
    public int getChineseScore() {
        return chineseScore;
    }

    /**
     * 设置
     * @param chineseScore
     */
    public void setChineseScore(int chineseScore) {
        this.chineseScore = chineseScore;
    }

    /**
     * 获取
     * @return mathScore
     */
    public int getMathScore() {
        return mathScore;
    }

    /**
     * 设置
     * @param mathScore
     */
    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    /**
     * 获取
     * @return englishScore
     */
    public int getEnglishScore() {
        return englishScore;
    }

    /**
     * 设置
     * @param englishScore
     */
    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    //获得总分
    public int getSumScore(){
        return chineseScore + mathScore + englishScore;
    }

    public String toString() {
        return "Student2{name = " + name + ", age = " + age + ", chineseScore = " + chineseScore + ", mathScore = " + mathScore + ", englishScore = " + englishScore + "}";
    }

    @Override
    public int compareTo(Student2 o) {
        int i = o.getSumScore() - this.getSumScore();
        i = i == 0 ? o.getChineseScore() - this.getChineseScore(): i;
        i = i == 0 ? o.getMathScore() - this.getMathScore(): i;
        i = i == 0 ? o.getEnglishScore() - this.getEnglishScore(): i;
        i = i == 0 ? o.getAge() - this.getAge(): i;
        i = i == 0 ? o.getName().compareTo(this.getName()): i;
        return i;
    }
}

package com.deng;

public class Student {//学生类
    private int num;
    private String name;
    private int age;
    private int java;
    private int c_shar;
    private  int html;
    private int sql;
    private int sum;
    private double avg;

    public void setNum(int num){
        this.num=num;
    }
    public int getNum(){
        return this.num;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setJava(int java) {
        this.java = java;
    }
    public int getJava() {
        return java;
    }

    public void setC_shar(int c_shar) {
        this.c_shar = c_shar;
    }
    public int getC_shar() {
        return c_shar;
    }

    public void setHtml(int html) {
        this.html = html;
    }
    public int getHtml() {
        return html;
    }

    public void setSql(int sql) {
        this.sql = sql;
    }
    public int getSql() {
        return sql;
    }

    public void setSum() {
        this.sum = this.java+this.c_shar+this.html+this.sql;
    }
    public int getSum() {
        return sum;
    }

    public void setAvg() {
        this.avg = this.sum/4;
    }
    public double getAvg() {
        return avg;
    }

    public String toString(){
            String msg="\t"+this.num+"\t"+this.name+"\t"+this.age+"\t"+this.java
             +"\t"+this.c_shar+"\t"+this.html+"\t"+this.sql+"\t"+this.sum+"\t"+this.avg;
        return msg;
    }

}

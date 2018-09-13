package com.deng;
import java.util.Scanner;

/**
 * Created by dengkele on 2017/3/15.
 */
public class Admin {//用来管理学生的一个类
    Scanner in =new Scanner(System.in);
    String msg="\t编号\t姓名\t年龄\tJava\tC#\tHtml\tSql\t总分\t平均分";
    public void print(Student[] arr){//用来刷新数据,打印最新数据
        System.out.println(msg);
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=null){
                arr[i].setSum();
                arr[i].setAvg();
                System.out.println(arr[i]);
            }
        }
    }
    public boolean exist(int num,Student stu){//判断学生是否存在
        if (stu!=null){
            if (stu.getNum()==num){
                return true;
            }else {
                return false;
            }
        }return false;

    }
    public void create(String name,int age,Student[] arr){//添加学生的方法
        Student stu=new Student();
        stu.setName(name);
        stu.setAge(age);
        int i=this.setIndex(arr);
        stu.setNum(i);
        if (i==99999){
            System.out.println("学生人数已达到最大值，不能再添加了");
        }
        else {
            arr[i] = stu;
        }
        this.print(arr);
    }
    public int setIndex(Student[] arr){//返回数组里面为空的下标
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == null) {
                return i;
            }
        }
        return 99999;
    }

    public void select(int num,Student[] arr){//查询学生方法
        System.out.println(msg);
        for (int i=0;i<arr.length;i++){
            if (this.exist(num,arr[i])==true){
                System.out.println(msg);
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println("--系统不存在这个学生--");
    }

    public void update(int num,String name,int age,Student[] arr){//更新学员信息
        for (int i=0;i<arr.length;i++){
            if (this.exist(num,arr[i])) {
                arr[i].setName(name);
                arr[i].setAge(age);
                System.out.println("****更新学生信息成功****");
                this.print(arr);
                return;
            }
        }
        System.out.println("没找到该学生，学生信息更新失败");
    }
    public void detele(int num,Student[] arr){//删除学生信息
        for (int i=0;i<arr.length;i++){
            if (this.exist(num,arr[i])){
                arr[i]=null;
                System.out.println("****删除学生信息成功****");
                this.print(arr);
                return;
            }
        }
        System.out.println("您所指定编号的学生不存在");
    }

    public void input(int num,Student[] arr){//输入学生成绩
        for (int i=0;i<arr.length;i++){
            if (this.exist(num,arr[i])){
                System.out.println("请输入"+arr[i].getName()+"Java的成绩");
                if (in.hasNextInt()){
                    arr[i].setJava(in.nextInt());
                }
                System.out.println("请输入"+arr[i].getName()+"C#的成绩");
                if (in.hasNextInt()) {
                    arr[i].setC_shar(in.nextInt());
                }
                System.out.println("请输入"+arr[i].getName()+"Html的成绩");
                if (in.hasNextInt()) {
                    arr[i].setHtml(in.nextInt());
                }
                System.out.println("请输入"+arr[i].getName()+"Sql的成绩");
                if (in.hasNextInt()) {
                    arr[i].setSql(in.nextInt());
                }
                this.print(arr);
                break;
            }
        }
    }

    public void courseSort(int num,Student[] arr){//根据指定科目成绩进行排序操作
        if (num==1){
            for (int i=0;i<arr.length;i++){
                for (int j=i+1;j<arr.length;j++){
                    if (arr[i]!=null&&arr[j]!=null){
                        if (arr[i].getJava()<arr[j].getJava()) {
                            Student t = arr[i];
                            arr[i] = arr[j];
                            arr[j] = t;
                        }

                    }
                }
            }
        } else if (num==2){
            for (int i=0;i<arr.length;i++){
                for (int j=i+1;j<arr.length;j++){
                    if (arr[i]!=null&&arr[j]!=null){
                        if (arr[i].getC_shar()<arr[j].getC_shar()) {
                            Student t = arr[i];
                            arr[i] = arr[j];
                            arr[j] = t;
                        }

                    }
                }
            }
        } else if (num==3){
            for (int i=0;i<arr.length;i++){
                for (int j=i+1;j<arr.length;j++){
                    if (arr[i]!=null&&arr[j]!=null){
                        if (arr[i].getHtml()<arr[j].getHtml()) {
                            Student t = arr[i];
                            arr[i] = arr[j];
                            arr[j] = t;
                        }

                    }
                }
            }
        }else if (num==4){
            for (int i=0;i<arr.length;i++){
                for (int j=i+1;j<arr.length;j++){
                    if (arr[i]!=null&&arr[j]!=null){
                        if (arr[i].getSql()<arr[j].getSql()) {
                            Student t = arr[i];
                            arr[i] = arr[j];
                            arr[j] = t;
                        }

                    }
                }
            }
        }
        this.print(arr);
    }

    public void sunSort(Student[] arr) { //根据总分进行排序
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != null && arr[j] != null) {
                    if (arr[i].getSum() < arr[j].getSum()) {
                        Student t = arr[i];
                        arr[i] = arr[j];
                        arr[j] = t;
                    }

                }
            }
        }
        this.print(arr);
    }
}


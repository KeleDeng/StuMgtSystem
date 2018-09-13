package com.deng;

/**
 * Created by dengkele on 2017/3/13.
 */
import java.util.Scanner;
public class Text {//主程序

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println("--请定义学生人数--");
        Student[] stuArr = new Student[3];
        Admin adminStu = new Admin();
        while (true) {
            System.out.println("请选择你要执行的功能：");
            System.out.println("10:添加一个学生");
            System.out.println("11:查找一个学生");
            System.out.println("12:根据学生编号更新学生基本信息");
            System.out.println("13:根据学生编号删除学生");
            System.out.println("14:根据编号输入学生各门成绩");
            System.out.println("15:根据某门成绩进行排序");
            System.out.println("16:根据总分进行排序");
            System.out.println("99:退出系统");
            String number = in.next();
            if (number.equals("10")) {//添加学生
                System.out.println("请输入学生姓名:");
                String name = in.next();
                System.out.println("请输入学生的年龄：");
                int age = in.nextInt();
                adminStu.create(name, age, stuArr);
            } else if (number.equals("11")) { //查找学生
                System.out.println("执行查找学生的基本信息操作");
                System.out.println("请输入学生的编号进行查找");
                int num = in.nextInt();
                adminStu.select(num, stuArr);
            } else if (number.equals("12")) {//更新学生
                System.out.println("执行更新学员的基本信息");
                System.out.println("请输入学生的编号：");
                int num = in.nextInt();
                System.out.println("请输入学生的姓名：");
                String name = in.next();
                System.out.println("请输入学生的年龄：");
                int age = in.nextInt();
                adminStu.update(num, name, age, stuArr);
            } else if (number.equals("13")){//删除学生信息
                System.out.println("执行删除学生信息操作");
                System.out.println("请输入学生的编号:");
                int num=in.nextInt();
                adminStu.detele(num,stuArr);
            }else if (number.equals("14")){//输入成绩操作
                System.out.println("执行输入成绩操作");
                System.out.println("请输入学生的编号：");
                int num=in.nextInt();
                adminStu.input(num,stuArr);
            }else if (number.equals("15")){
                System.out.println("执行根据某门成绩进行排序");
                System.out.println("请输入1.Java 2.C# 3.Html 4.Sql");
                int num=in.nextInt();
                adminStu.courseSort(num,stuArr);
            }else if (number.equals("16")){
                System.out.println("执行根据总分进行排序");
                adminStu.sunSort(stuArr);
            }else if (number.equals("99")){
                System.out.println("您已退出系统!");
                System.exit(0);
            }

        }

    }
}

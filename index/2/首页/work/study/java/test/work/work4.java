//author:steam-404

import java.util.Scanner;

public class work4 {
    public static void main(String[] args) {
        //定义一个类，包含3个属性(学号,姓名,成绩),均为私有
        //定义两个方法
        //设置值
        //获取值
        Scanner input=new Scanner(System.in);
        System.out.println("请输入学号");
        int id= input.nextInt();
        System.out.println("姓名");
        String name= input.next();
        System.out.println("请输入成绩");
        int score=input.nextInt();
        student message = new student();
        message.set(id,name,score);
        message.get();
    }

}
class student{
    private int id;
    private String name;
    private int score;

    public void set(int id,String name,int score) {
        this.id = id;
        this.name=name;
        this.score=score;
    }
    public void get(){
        System.out.println("学号:"+id);
        System.out.println("姓名:"+name);
        System.out.println("成绩:"+score);
    }
}

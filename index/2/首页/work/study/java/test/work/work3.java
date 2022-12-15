//author:steam-404

//检测密码:
//至少8位
//只能包含字母和数字
//必须包含两个数字

import java.util.Scanner;

public class work3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = input.next();


        int count = 0;//密码长度
        int number = 0;//数字长度
        for (int i = 0; i < password.length(); i++) {
            count++;
            if (password.charAt(i) >= '0' && password.charAt(i) >= '9') {
                number++;
            }

        }

        //判断是否只包含数字和字母
        int flag = 0;//0表示不包含
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= '0' && password.charAt(i) <= '9' || password.charAt(i) >= 'a' && password.charAt(i) <= 'z' || password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                flag = 0;
            } else {
                flag = 1;//包含其他字符
            }
        }
        if (flag == 0) {
            System.out.println("不包含其他字符");
        } else {
            System.out.println("包含其他字符");
        }
        int counts=count;
        count=count-number;
        System.out.println("密码长度:" + counts);
        System.out.println("数字个数:" + count);

        if (counts >= 8) {
            if (flag==0){
                if(number>=2){
                    System.out.println("密码合法");
                }else {
                    System.out.println("密码必须包含两位数字");
                }
            }else {
                System.out.println("密码包含其他字符");
            }
        } else {
            System.out.println("密码长度不足");
        }

    }
}

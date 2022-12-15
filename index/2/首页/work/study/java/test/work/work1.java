//author:steam-404

//输入三位整数,判断是否回文数

import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个三位整数");
        String message1 = input.next();
        String message2 = "";
        for (int i = message1.length() - 1; i >= 0; i--) {
            message2 += message1.charAt(i);
        }

        if(message1.equals(message2)){
            System.out.println("是回文数");
        }else{
            System.out.println("不是回文数");
        }
    }
}

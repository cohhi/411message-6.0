//author:steam-404

//输入某年某月,判断这一天时这一年的第几天

import java.util.Scanner;
public class work2 {
    public static void main(String[] args) {
        int[] message1 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //定义闰年
        int[] message2 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //定义平年

        Scanner input=new Scanner(System.in);

        System.out.println("请输入年份");
        int year = input.nextInt();
        System.out.println("请输入月份");
        int month = input.nextInt();
        System.out.println("请输入日期");
        int day = input.nextInt();
        int date=0;//这一年的天数
//        判断是否闰年
        if (year % 4 == 0 && year % 400 != 0) {
            System.out.println(year + "年是闰年");
            for (int i = 0; i <= month - 1; i++) {
                date += message1[i];
            }

        } else {
            System.out.println(year + "年是平年");
            for (int i = 0; i <= month - 1; i++) {
                date += message2[i];
            }
        }
        date=date+day;
        System.out.println(year+"年"+month+"月"+day+"日是"+year+"年的第"+date+"天");
    }
}

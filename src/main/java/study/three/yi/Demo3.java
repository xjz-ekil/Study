package study.three.yi;

import java.util.Scanner;

/*
键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数
 */
public class Demo3 {
    public static void main(String[] args) {
        //录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        //统计
        int count1=0;
        int count2=0;
        int count3=0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //嗯对，查看ASCII码表。
            if(c>='a'&&c<='z'){
                count2++;
            }else if(c>='A'&&c<='Z'){
                count1++;
            }else if(c>='0'&&c<='9'){
                count3++;
            }

        }
        System.out.println("大写字符有"+count1+"个");
        System.out.println("小写字符有"+count2+"个");
        System.out.println("数字字符有"+count3+"个");

    }
}

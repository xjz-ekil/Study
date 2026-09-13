package study.two.qi;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        //假设我现在键盘录入一个abc
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1=sc.next();
        String str2="abc";
        System.out.println(str1==str2);
    }
}

package study.one.san;

import java.util.Scanner;

/*
需求：键盘录入一个大于等于2的整数x，计算并返回x的平方根
结果只保留整数部分  小数部分将被舍去
 */
public class demo3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
            if(i*i==x){
                System.out.println(i);
                break;
            }else if(i*i>x){
                System.out.println(i-1);
                break;
            }
        }
    }
}

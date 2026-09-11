package study.one.er;
/*
需求：键盘录入一个正整数x，判断该整数是否为一个质数；
 */
import java.util.Scanner;

public class demo4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        boolean a=true;
        if(x==1){
            System.out.println("这不是质数也不是合数");
        }
        if(x==2){
            System.out.println("这是质数");
        }
        for(int i=2;i<x;i++){
            if(x%i==0){
                a=false;
                break;
            }

        }
        if(a){
            System.out.println("这是质数");
        }else{
            System.out.println("这不是质数");
        }
    }
}

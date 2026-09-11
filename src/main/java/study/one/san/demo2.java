package study.one.san;
/*
逢七过
从任意一个数字开始报数，当你要报的数字是包含7或者是7的倍数时都要说过
需求：使用程序在控制台打印出1-100之间的满足逢七必过的数据
 */
public class demo2 {
    public static void main(String[] args){
        for(int i=0;i<=100;i++){
            if(i%7==0||i%10==7||i/10==7){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}

package study.one.er;
import java.util.Scanner;
/*
键盘录入两个数字，表示一个范围。
统计这个范围中
技能被3整除，又能被5整除数字有多少个？
 */
public class demo1 {
    public static void main(String[] args){

        Scanner min=new Scanner(System.in);
        Scanner max=new Scanner(System.in);
        int a=min.nextInt();
        int b=max.nextInt();
        int count=0;
        for(int i=a;i<=b;i++){
            if(i%3==0&&i%5==0){
                count+=1;
                System.out.println(i);
            }
        }
        System.out.println("这个范围中能被3整除，又能被5整除的数字有"+count+"个");
    }
}

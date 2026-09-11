package study.one.er;
import java.util.Random;
import java.util.Scanner;

/*
生成随机数1-100
random生成的随机数为0——n-1所以要1-100的话要加一
猜数字
 */
public class demote {
    public static void main(String[] args){
        Random r=new Random();
        int number=r.nextInt(101)+1;
        Scanner sc=new Scanner(System.in);

        while(true){
            int a=sc.nextInt();
            if(a>number){
                System.out.println("猜大了");
            }else if(a<number){
                System.out.println("猜小了");
            }else{
                System.out.println("猜对了");
                break;
            }
        }
    }
}

package study.one.yi;
import java.util.Scanner;
public class demo1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入今天周几：");
        String a=sc.nextLine();
        switch(a){
            case "周一":
                System.out.println("跑步");
                break;
            case "周二":
                System.out.println("游泳");
                break;
            case "周三":
                System.out.println("篮球");
                break;
            default:
                System.out.println("其他");
                break;
        }

    }
}

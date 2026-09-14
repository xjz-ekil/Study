package study.three.yi;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
已知正确的用户名和密码，请用程序实现模拟用户登录
总共给三次机会，登录后，给出相应的提示
 */
public class Demo1 {
    public static void main(String[] args) {
        //定义用户名和密码
        String name="zhangsan";
        String pasword="zz123";



        for (int i = 0; i < 3; i++) {
            //模拟输入
            Scanner sc=new Scanner(System.in);
            //总共给三次机会
            System.out.println("请输入用户名");
            String username = sc.next();
            System.out.println("请输入密码");
            String userpasword = sc.next();

            //比较
            if(username.equals(name) && userpasword.equals(pasword)){
                System.out.println("登录成功");
                break;
            }else {
                System.out.println("用户名或密码有误,请重新输入，您还剩"+(2-i)+"次机会");
            }
        }


    }
}

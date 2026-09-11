package study.two.san;
/*
使用方法重载的思想，设计比较两个整数是否相同的方法
要求：兼容全整数类型（byte，short，int，long）
 */
public class demo6 {
    public static void main(String[] args) {
        com(2.4,5);
    }
    public static void com(int a,int b){
        System.out.println(a==b);
    }
    public static void com(double a1,double b1){
        System.out.println(a1==b1);
    }
    public static void com(short a2,short b2){
        System.out.println(a2==b2);
    }
    public static void com(long a3,long b3){
        System.out.println(a3==b3);
    }
}

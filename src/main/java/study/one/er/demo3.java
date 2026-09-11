package study.one.er;
/*
需求：给定两个整数，被除数和除数（都是正数，且不超过int的范围）。
将两数相除，要求不使用乘法、除法和%运算符
得到商和余数
 */
public class demo3 {
    public static void main(String[] args){
        //思路：看除数中有多少个被除数，就是商
        int a=123;
        int b=10;
        //记录减的次数就是商
        int count=0;
        while(a>=b){
            a-=b;
            count++;
        }
        System.out.println(count);
        //余数就是a
        System.out.println(a);
    }
}

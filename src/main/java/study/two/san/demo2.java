package study.two.san;
/*
定义一个方法，求长方形的周长，将结果在方法中进行打印
 */
public class demo2 {
    public static void main(String[] args){
        getL(10,20);
    }
    public static void getL(int a,int b){
        int L=(a+b)*2;
        System.out.println(L);
    }
}

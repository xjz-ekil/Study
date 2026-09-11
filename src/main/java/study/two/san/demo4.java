package study.two.san;
/*
定义一个方法，求一家商场每个季度的营业额
根据方法结果再计算出全年营业额。
 */
public class demo4 {
    public static void main(String[] args){
        double sum1=sum(1,2,3);
        double sum2=sum(1,2,3);
        double sum3=sum(1,2,3);
        double sum4=sum(1,2,3);
        double summ=sum1+sum2+sum3+sum4;
        System.out.println(summ);
    }
    public static double sum(double a,double b,double c){
        return a+b+c;
    }
}

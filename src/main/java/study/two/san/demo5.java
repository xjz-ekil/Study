package study.two.san;
/*
定义方法，比较 两个长方形的面积
 */
public class demo5 {
    public static void main(String[] args) {
        double A=getArea(3,4);
        double B=getArea(4,5);
        if(A>B){
            System.out.println("第一个大");
        }else if(A==B){
            System.out.println("一样大");
        }else{
            System.out.println("第二个大");
        }
    }
    public static double getArea(double C,double K){
        double area=C*K;
        return area;
    }
}
 
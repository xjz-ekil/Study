package study.two.si;

import java.util.Scanner;

/*
需求:
机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱
按照如下规则计算机票价格：旺季（5-10月）头等舱9折、经济舱8.5折，淡季（11月到来年4月）头等舱7折、经济舱6.5折
 */
public class demo1 {
    public static void main(String[] args) {
        //设置机票金额,注意到折扣有小数，所以改为double
        double TouPiao=9999;
        double JingPiao=888;
        //直接定义月份，拒绝用户输入啦啦啦___随便填
        int Month=4;

        //用户输入购买的票数和选择的舱座
        Scanner sc=new Scanner(System.in);
        System.out.println("请选择舱坐：A.经济舱,B.头等舱");
        char SelectPiao=sc.next().charAt(0);
        System.out.println("请输入购买数量：");
        int CountPiao=sc.nextInt();

        if(SelectPiao=='A'){
            //此时是经济舱
            System.out.println("总价为"+SumJing(JingPiao,Month,CountPiao));
        }else if(SelectPiao=='B'){
            System.out.println("总价为"+SumTou(TouPiao,Month,CountPiao));
        }else {
            System.out.println("请输入正确选项");
        }

    }
    //定义方法计算票数乘以价格，返回总和
    //经济舱———传入机票价和月份和票数
    public static double SumJing(double a,int b,int c){
        //先判断月份，看看折扣
        //记录单张票价格
        double sum=a;
        if(b>=5&&b<=10){
            sum*=0.85;
        }else if((0<b&&b<=4)||(b>=11&&b<=12)){
            sum*=0.65;
        }else {
            System.out.println("客户端出错，月份显示错误，请找客服反映");
        }
        double All=sum*c;
        return All;
    }
    //ok,再写头等舱，
    public static double SumTou(double a,int b,int c){
        //先判断月份，看看折扣
        //记录单张票价格
        double sum=a;
        if(b>=5&&b<=10){
            sum*=0.85;
        }else if((0<b&&b<=4)||(b>=11&&b<=12)){
            sum*=0.65;
        }else {
            System.out.println("客户端出错，月份显示错误，请找客服反映");
        }
        double All=sum*c;
        return All;
    }
}

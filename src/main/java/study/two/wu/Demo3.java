package study.two.wu;

import java.util.Scanner;

/*
在唱歌比赛中，有六名评委给选手打分，分数范围是[0-100]之间的整数。
选手的最后得分为：
去掉最高分、最低分后的四个评委的平均分，
请完成上述过程并计算出选手的得分
 */
public class Demo3 {
    public static void main(String[] args){
        //要连续输入六次分数，将其记录在一个数组中
        //然后在找出最大值和最小值，或者将其按从小到大然后去掉首尾，感觉前面好写

        //输入评分
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("请第"+(i+1)+"个评委输入评分");
            int a=sc.nextInt();
            if(a>100||a<0){
                System.out.println("输入错误，请重新输入");
                i--;
            }else{
                arr[i]=a;
            }
        }

        //找最大最小值
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            //考虑最大或者最小相等的情况要等于号
            if(arr[i]<=min){
                min=arr[i];
            }
        }
        //此时的最小值要舍去
//        同理获得最大值
        int max=arr[0];
        for (int i = 1; i <arr.length; i++) {
            if(arr[i]>=max){
                max=arr[i];
            }
        }
        //用全部数据的总和减去最大值和最小值
        //总和
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            count+=arr[i];
        }
        double Late=(((double)(count-min-max))/(arr.length-2));
        System.out.println(Late);

        //ok,写着写着忘了是六个评委了嘿嘿嘿，好吧，还忘了限制评分范围
        sc.close();
    }


}

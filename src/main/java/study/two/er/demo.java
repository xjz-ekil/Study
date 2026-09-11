package study.two.er;

import java.util.Random;

/*
需求：生成10个1~100之间的随机数存入数组
1,求出所有数据的和
2,求所有数据的平均数
3,统计有多少个数据比平均值小
 */
public class demo {
    public static void main(String[] args){
        //先定义一个数组
        int[] arr=new int[10];

        //获取随机数
        Random r=new Random();

        for(int i=0;i<arr.length;i++){
            int number=r.nextInt(100)+1;
            arr[i]=number;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        //求和
        int num=0;
        for(int i=0;i< arr.length;i++){
            num+=arr[i];
        }
        System.out.println("所有数据和为："+num);
        //求平均数
        double age=((double)num)/arr.length;
        System.out.println("所有数据的平均数为："+age);
        //统计比平均数小的数据有多少个
        double min=age;
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                count++;
            }
        }
        System.out.println("有"+count+"个数比平均值小");
    }
}

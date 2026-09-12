package study.two.liu;

import java.util.Scanner;

/*
某系统的数字密码（大于0），比如1983,采用加密方式进行传输
规则如下：
先得到每位数，然后每位数都加上5,再对10求余，
最后将所有数字反转，得到一串新数
 */
public class Demo1 {
    public static void main(String[] args) {
        //获取密码
        //首先要知道有几位数吧
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int te=number;
        int count=0;
        while(number!=0){
            number=number/10;
            count++;
        }
        int[] arr=new int[count];
        //对数字进行裁剪
        int index=arr.length;
        while(te!=0){
            int ge=te%10;
            te=te/10;
            arr[index-1]=ge;
            index--;
        }
        //每个数加上5
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=arr[i]+5;
        }
        //在对10求余
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]%10;
        }
        //再对数字进行反转
        for (int i = 0,j=arr.length-1; i <j ; i++,j--) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        //再对数组进行拼接
        int numbe=0;
        for (int i = 0; i < arr.length; i++) {
            numbe=numbe*10+arr[i];
        }
        System.out.println("加密后"+numbe);


        //再解密回去
        //先反转，再返回余，再加5；
        for (int i = 0,j=arr.length-1; i <j ; i++,j--) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<5){
                arr[i]=arr[i]+5;
            }else {
                arr[i]=arr[i]-5;
            }
        }
        int Newnumbe=0;
        for (int i = 0; i < arr.length; i++) {
            Newnumbe=Newnumbe*10+arr[i];
        }
        System.out.println("解密后"+Newnumbe);


        //ok写累了，好几个综合练习，不想搞了，先留着，下周搞，
        //我要开始面向对象了
        //git add .
        //git commit -m "这里写本次修改内容，例如：新增xx练习题"
        //git push origin main
        //git推送到github嗯多加练习嘻嘻

    }
}

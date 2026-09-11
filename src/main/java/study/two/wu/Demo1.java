package study.two.wu;

import java.util.Random;

/*
定义方法实现随机产生一个5位的验证码
验证码格式：
    长度为5
    前四位是大写字母或者小写字母
    最后一位是数字
 */
public class Demo1 {
    public static void main(String[] args) {
        //大小写字母都放到数组中
        char[] chs=new char[52];
        for(int i=0;i<chs.length;i++){
            //ASCII码表
            //小写字母从98=a开始
            if(i<=25){
                chs[i]=(char)(97+i);
            }else{
                //添加大写字母
                //A=65
                chs[i]=(char)(65+i-26);
            }
        }
        //记录最终结果
        String result="";
        //随机抽取数组中的索引
        Random r=new Random();

        for (int i= 0; i< 4; i++) {
            int randomIndex=r.nextInt(chs.length);
            result=result+chs[randomIndex];
        }


        //随机抽取数字
        int number=r.nextInt(10);
        result=result+number;
        System.out.println(result);
    }
}

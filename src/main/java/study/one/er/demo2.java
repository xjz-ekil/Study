package study.one.er;
/*
需求：给你一个回文数x。
    如果x是一个回文整数，打印true，否则，返回false
解释：回文数是指正序（从左到右）和倒序（从右往左）读都是一样的整数。
例如，121是回文，而123不是。
 */
public class demo2 {
    public static void main(String[] args){
        //先给定一个数
        int x = 12321;
        //记录原始数据，因为在后面的循环中x的数据会被改变
        int temp=x;
        //记录反转后的数
        int num=0;
        //我们需要将x反转，
        while(x!=0){
            //得到个位数，等下放到最前面
            int ge=x%10;
            //去掉个位的数字
            x/=10;
            //将个位数放到最前面
            num=num*10+ge;
        }
        System.out.println(temp==num);
        //判断是否是回文数.是的话直接返回true

    }
}

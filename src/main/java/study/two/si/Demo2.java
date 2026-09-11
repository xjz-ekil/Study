package study.two.si;
/*
判断101-200之间有多少个素数，并输出所有素数。
 */
public class Demo2 {
    public static void main(String[] args) {
        //记录质数个数
        int count=0;
        for(int i=101;i<=200;i++){
            //判断是否为质数
            boolean falg=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    falg=false;
                    break;
                }
            }
            if(falg){
                System.out.println("当前数字"+i+"是质数");
                count++;
            }
        }
        System.out.println("一共有"+count+"个质数");
    }
}

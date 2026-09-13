package study.two.qi;

public class Demo2 {
    public static void main(String[] args) {
        //创建两个字符串对象
        String s1=new String("abe");
        String s2="abc";
        //比的是地址值
        System.out.println(s1==s2);

        //比较字符串中的内容是否相等
        boolean result=s1.equals(s2);
        System.out.println(result);

        //比较字符串对象中的内容是否相等，忽略大小写
        boolean result1=s1.equalsIgnoreCase(s2);
        System.out.println(result1);
    }
}

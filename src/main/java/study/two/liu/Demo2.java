package study.two.liu;

public class Demo2 {
    public static void main(String[] args) {
        Demo3 p=new Demo3();
        p.setAge(18);
        p.setName("小时");

        System.out.println(p.getAge());
        System.out.println(p.getName());

        p.One();
        p.Two();
    }
}

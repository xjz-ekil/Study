package study.two.liu;

public class Demo3 {
    private String name;
    private int age;

    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        if(a>=18&&a<=50){
            age=a;
        }else{
            System.out.println("非法参数");
        }
    }
    public int getAge(){
        return age;
    }


    public  void One(){
        System.out.println("hello我是："+name);
    }
    public void Two(){
        System.out.println("我今年"+age+"岁了");
    }
}

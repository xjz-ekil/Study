package study.two.liu;

public class Student {
    private String name;
    private int age;

    //无参构造
    public Student(){
        System.out.println("执行中");
    }

    //有参构造
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }


    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }


}

package study.two.qi;

public class GameTest {
    public static void main(String[] args) {
        //创建角色
        Role r1=new Role("A",100);
        Role r2=new Role("B",100);

        //开始打
        while(true){
            //r1攻击r2
            r1.attack(r2);
            if(r2.getBlood()==0){
                System.out.println(r1.getName()+" K0 "+r2.getName());
                break;
            }
            r2.attack(r1);
            if (r1.getBlood()==0){
                System.out.println(r2.getName()+" KO "+r1.getName());
                break;
            }
        }
    }
    //感觉写这东西，好累。
}

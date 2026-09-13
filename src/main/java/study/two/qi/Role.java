package study.two.qi;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }


    //定义一个方法用于攻击别人
    public void attack(Role role){
        //计算造成的伤害1~30
        Random r=new Random();
        int hurt = r.nextInt(30)+1;
        //剩余血量
        int remainBoold=role.getBlood()-hurt;
        //对剩余血量做验证，如果为负数，就修改成零
        remainBoold=remainBoold<0?0:remainBoold;
        //修改被打人的血量
        role.setBlood(remainBoold);
        //this表示方法的调用者
        System.out.println(this.getName()+"打了"+role.getName()
            +"一下造成了"+hurt+"点伤害"+role.getName()+"还剩下"+remainBoold+"点血"
        );
    }

}

package api;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/18 18:15
 * @info 1.0
 */
public class Hero {
    private String name;
    private Weapon weapon;
    private int age;
    private Skill skill;

    public Hero(String name, Weapon weapon, int age, Skill skill) {
        this.name = name;
        this.weapon = weapon;
        this.age = age;
        this.skill = skill;
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Hero() {
    }

    public Hero(String name, Weapon weapon, int age) {
        this.name = name;
        this.weapon = weapon;
        this.age = age;
    }

    public void attack() {
            System.out.println("年龄" + age + name + "使用" + weapon.getCode() + "攻击敌人");
    }

    public void skillAttack(){
            System.out.println(name+"释放了");
            skill.method();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

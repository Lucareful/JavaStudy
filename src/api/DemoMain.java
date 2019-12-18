package api;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/18 18:15
 * @info 1.0
 */
public class DemoMain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("巫妖王");
        hero.setAge(3000);

        Weapon weapon = new Weapon("霜之哀伤");
        hero.setWeapon(weapon);

        hero.attack();
        System.out.println("================ 分割线 ================");

        Hero hero1 = new Hero();
        hero1.setName("艾希");

        Skill skill = new Skill() {
            @Override
            public void method() {
                System.out.println("誓约之剑");
            }
        };
        hero1.setSkill(skill);

        hero1.skillAttack();
    }
}

package luenci.array;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/9 10:56
 * @info 存储自定义集合对象
 */
public class ArrayListdemo {
    public static void main(String[] args) {
        Person[] array = new Person[3];

        Person one = new Person("Luenci",20);
        Person tow = new Person("Lynn",20);
        Person thr = new Person("Lucy",20);

        // 将地址值赋值到数组
        array[0] = one;
        array[1] = tow;
        array[2] = thr;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        Person person = array[1];
        System.out.println(person.getName());

        System.out.println(array[0].getName());



    }
}

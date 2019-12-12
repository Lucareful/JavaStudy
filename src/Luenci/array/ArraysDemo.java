package luenci.array;

import java.util.Arrays;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/12 17:25
 * @info Arrays类的常见的使用方法
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        String str = Arrays.toString(array);
        System.out.println(str);

        int[] array1 = {1,4,5,9,2,5,7,0};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        String[] array2 = {"aaa","ccc","bbb"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}

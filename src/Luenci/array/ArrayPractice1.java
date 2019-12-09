package luenci.array;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/5 10:40
 * @info 数组的使用例子
 */
public class ArrayPractice1 {
    public static void main(String[] args) {

        // 动态初始化
        int[] array1 = new int[10];

        // 静态初始化
        int[] array2 = new int[]{1, 2, 3, 4, 5, 6};

        // 反转数组
        int[] news = inverseArray(array2);
        for (int i = 0; i < news.length; i++) {
            System.out.println(news[i]);
        }

        // 获取数组的最大值
        int max = getMax(array2);
        System.out.println("数组的最大值为：" + max);

        // 对数组进行从小到大的排序
        int[] sort = sortArray(array2);
        for (int j = 0; j < sort.length; j++) {
            System.out.println(sort[j]);
        }

        // 获取数组的长度
        System.out.println("数组的长度为：" + array2.length);


    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    public static int[] sortArray(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }


    public static int[] inverseArray(int[] array) {
        for (int min = 0, max = array.length - 1; min < max; min++, max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        return array;
    }
}


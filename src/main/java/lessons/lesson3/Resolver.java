package lessons.lesson3;

/**
 * @Author Александр Ключка
 * @created 2022-09-04  23:33
 **/

import java.util.Arrays;

public class Resolver {

    /**
     * @param array may be null or empty
     * */
    public int getMin(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array could not be empty");
        }

//        IntStream.of(array)
//                .min()
//                .orElseThrow(() -> new IllegalArgumentException("Array could not be empty"));
//
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public int[] sort(int[] array) {
        Arrays.sort(array);
        return array;
    }

}
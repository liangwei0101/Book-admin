package com.hundsun.book.util;

import java.util.Random;

public class util {

    /**
     * 产品随机数
     */
    public static String RandomNumber() {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        //随机对象
        Random rand = new Random();

        //循环产生
        for (int i = 10; i > 1; i--) {
            int index = rand.nextInt(i);
            int tmp = array[index];
            array[index] = array[i - 1];
            array[i - 1] = tmp;
        }

        //拼接结果为字符串
        int result = 0;
        for (int i = 0; i < 6; i++)
            result = result * 10 + array[i];
        String sixString = Integer.toString(result);

        //有可能出现5位数，前面加0补全
        if (sixString.length() == 5) {
            sixString = "0" + sixString;
        }

        return sixString;
    }
}

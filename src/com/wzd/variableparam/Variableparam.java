package com.wzd.variableparam;

/**
 * @author ：ZeDongW
 * @version : 1.0
 * @ClassName : Variableparam
 * @description：JDK1.5新特性之------可变参数
 * @modified By：
 * @date ：Created in 2019/01/24/0024 6:14
 */
public class Variableparam {
    public static void main(String[] args) {
        add(2,32,12,23,33);
    }

    /**
     * @Author     : ZeDongW
     * @Description: 可变参数函数
     * @Date       : 2019/01/24/0024 6:27
     * @Param      :
     * @return     :
     */
    private static void add (int... arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        System.out.println("求和结果为：" + result);
    }
}

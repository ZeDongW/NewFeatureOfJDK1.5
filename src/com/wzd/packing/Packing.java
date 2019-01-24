package com.wzd.packing;

/**
 * @author ：ZeDongW
 * @version : 1.0
 * @ClassName : Packing
 * @description：JDK1.5新特性之------自动装箱与自动拆箱
 * @modified By：
 * @date ：Created in 2019/01/24/0024 6:37
 */
public class Packing {
    public static void main(String[] args) {
        String str = "12";

        //字符串转换为int类型，可以把字符串转换成数字
        int a = Integer.parseInt(str);
        System.out.println(a);

        //把数字转换成字符串
        int b = 23;
        String s = Integer.toString(b);
        System.out.println(s + 1);

        //把整数转换成对应的进制
        int c = 101;
        System.out.println("二进制数据:" + Integer.toBinaryString(c));
        System.out.println("八进制数据:" + Integer.toOctalString(c));
        System.out.println("十六进制数据:" + Integer.toHexString(c));

        //自动装箱
        int k = 12;
        Integer d = k;

        //自动拆箱
        Integer e = 13;
        int f = e;

        //引用的数据类型  Integer内部维护了一个缓冲数组，范围是-128~127
        Integer g = 14;
        Integer h = 14;
        System.out.println("g,h相等吗？" + g.equals(h));
        Integer i = 128;
        Integer j = 123;
        System.out.println("i,j相等吗？" + i.equals(j));
    }
}

package com.wzd.foreach;

import java.util.*;

/**
 * @author ：ZeDongW
 * @version : 1.0
 * @ClassName : ForEach
 * @description：JDK1.5新特性：增强for循环
 * @modified By：
 * @date ：Created in 2019/01/22/0022 6:54
 */
public class ForEach {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("sdf");
        set.add("dfg");
        set.add("xb");

        //使用迭代器遍历
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println("迭代器迭代集合元素:" + it.next());
        }

        //增强for循环
        for (String  s : set) {
            System.out.println("foreach迭代：" + s);
        }

        int[] arr = {3,4,23,54,143,32};

        //普通for循环遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println("普通for循环遍历数组：" + arr[i]);
        }

        //增强for循环遍历数组
        for (int i : arr) {
            System.out.println("增强for循环遍历数组：" + i);
        }

        //注意：Map结合没有实现Iterable接口，不能直接使用增强for循环，如果要使用增强for循环，需要借助与Collection集合
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("123","abc");
        map.put("456","sdf");
        map.put("23","fgd");
        map.put("234","fgh");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("键：" + entry.getKey() + "  值：" + entry.getValue());
        }
    }
}

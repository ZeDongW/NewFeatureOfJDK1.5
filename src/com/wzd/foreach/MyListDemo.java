package com.wzd.foreach;

/**
 * @author ：ZeDongW
 * @version : 1.0
 * @ClassName : MyListDemo
 * @description：自定义集合类演示
 * @modified By：
 * @date ：Created in 2019/01/22/0022 7:45
 */
public class MyListDemo {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.add("ada");
        list.add(123);
        list.add('a');
        for (Object s : list) {
            System.out.println(s);
        }
    }
}

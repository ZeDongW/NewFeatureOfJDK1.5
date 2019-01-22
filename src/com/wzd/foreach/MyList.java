package com.wzd.foreach;

import java.util.Iterator;

/**
 * @author ：ZeDongW
 * @version : 1.0
 * @ClassName : MyList
 * @description：自定义一个集合类实现Iterable接口
 * @modified By：
 * @date ：Created in 2019/01/22/0022 7:35
 */
public class MyList implements Iterable{
    private Object[] arr = new Object[10];  //底层维护一个Object数组来存储元素
    private int index = 0;  //定义一个集合类的游标，初始指向0

    /**
     * @Author     : ZeDongW
     * @Description: 自定义集合添加元素的方法
     * @Date       : 2019/01/22/0022 7:39
     * @Param      : [o]
     * @return     : void
     */
    public void add(Object o){
        arr[index++] = o;
    }

    /**
     * @Author     : ZeDongW
     * @Description: 匿名内部类
     * @Date       : 2019/01/22/0022 8:19
     * @Param      : []
     * @return     : java.util.Iterator
     */
    @Override
    public Iterator iterator() {
        return new Iterator() {

            private int course = 0;

            @Override
            public boolean hasNext() {
                return course<index;
            }

            @Override
            public Object next() {
                return arr[course++];
            }
        };
    }

}

package com.wzd.staticimports;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.*;

/**
 * @author ：ZeDongW
 * @version : 1.0
 * @ClassName : StaticImports
 * @description：1.5新特性：静态导入
 * @modified By：
 * @date ：Created in 2019/01/22/0022 6:11
 */
public class StaticImports {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(9);
        list.add(22);
        list.add(6);
        Collections.sort(list);
        System.out.println("集合元素" + list);
        System.out.println("索引值" + binarySearch(list,22));
        System.out.println("最小值" + min(list));
        System.out.println("最大值" + max(list));
    }

    /**
     * @Author     : ZeDongW
     * @Description: 本地同名成员变量
     * @Date       : 2019/01/22/0022 6:43
     * @Param      : [list]
     * @return     : void
     */
    public static void sort(ArrayList<Integer> list){
        System.out.println("本类同名成员变量....");
    }
}


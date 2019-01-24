package com.wzd.enums;

/**
 * @author ：ZeDongW
 * @version : 1.0
 * @ClassName : Enum
 * @description：JDK1.5新特性之------枚举类
 * @modified By：
 * @date ：Created in 2019/01/24/0024 7:53
 */
enum Sex{
    man("男") {
        @Override
        public void run() {

        }
    },woman("女") {
        @Override
        public void run() {

        }
    }; //枚举值

    String value; //成员变量

    //构造函数
    private Sex(String value){
        this.value = value;
    }

    //成员函数
    public void getValue(){
        System.out.println("value:" + value);
    }

    //抽象函数
    public abstract void run();
}

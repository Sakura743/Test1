package controller;

import org.apache.commons.lang3.reflect.MethodUtils;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("controller.UserController");

        //判断一个类：controller.UserController是否使用了Controller注解

        boolean result = clazz.isAnnotationPresent(Controller.class);

        System.out.println(result);

        //寻找某个类的哪些方法使用了RequestMapping注解
        Method methods[] = MethodUtils.getMethodsWithAnnotation(clazz, RequestMapping.class);

        System.out.println(methods.length);//结果？1

    }
}
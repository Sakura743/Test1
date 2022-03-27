package annotation;

import org.apache.commons.lang3.reflect.MethodUtils;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("annotation.UserController");
        boolean result = clazz.isAnnotationPresent(annotation.Controller.class);
        System.out.println(result);


        Method[] methods = MethodUtils.getMethodsWithAnnotation(clazz,RequestMapping.class);
        System.out.println(methods.length);

        Arrays.stream(methods).forEach((method)->
        {
            RequestMapping requestMapping = method.getAnnotation(RequestMapping.class);
            System.out.println(requestMapping.value());
        });
    }
}

package annotation;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@annotation.Controller

public class UserController {
    @RequestMapping(value = "test")
    public String m1(){
        return  " ";
    }

    public String m2(){
        return "";
    }
}

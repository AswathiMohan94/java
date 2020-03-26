package com.gradle.java;
import java.lang.annotation.*;
@Documented
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
    String author() default "Aswathi";
    String date();
    int revision() default 1;
    String comments();
}

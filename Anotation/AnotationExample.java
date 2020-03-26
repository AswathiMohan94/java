package com.gradle.java;
//import sun.management.MethodInfo;
import com.gradle.java.MethodInfo;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
class AnnotationExample {

    @Override
    @MethodInfo(author = "Aswathi", date = "25 jan 2020", revision = 1, comments = "main")
    public String toString() {
        return "Overridden toString method";
    }
    @Deprecated
    public static void oldMethod(){
        System.out.println("old method, don't use it.");
    }
    public static void main(String[] args){
        try{
            for (Method method : AnnotationExample.class.getMethods()){
                if(method.isAnnotationPresent(MethodInfo.class)){
                    try{
                        for(Annotation anno : method.getDeclaredAnnotations()){
                            System.out.println("Annotation in Method '"+method+"' :"+anno);
                        }
                        MethodInfo methodAnno = method.getAnnotation(MethodInfo.class);
                        if(methodAnno.revision() ==1){
                            System.out.println("Method with revision no 1= "+method);
                        }
                    }catch (Throwable ex){
                        ex.printStackTrace();
                    }
                }
            }
        }catch (SecurityException e){
            e.printStackTrace();
        }
    }
}




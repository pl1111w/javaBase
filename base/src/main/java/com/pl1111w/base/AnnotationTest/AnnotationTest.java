package com.pl1111w.base.AnnotationTest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/11/14 12:54
 */
@MyAnnotation
public class AnnotationTest {
    @MyAnnotation
    AnnotationTest(@MyAnnotation int number){

    }
    @MyAnnotation
    private int number;
}
class AnnotationChildTest extends AnnotationTest{

    private String name;

    AnnotationChildTest(int number,String name) {
        super(number);
    }

    public static void main(String[] args) throws NoSuchFieldException {
         Class cla = AnnotationChildTest.class;
        Field declaredField = cla.getDeclaredField("number");
        Annotation[] declaredFieldAnnotations = declaredField.getAnnotations();
        Annotation annotations[] = cla.getAnnotations();
         for(Annotation annotation:annotations){
             System.out.println(annotation.toString());
         }
    }
}
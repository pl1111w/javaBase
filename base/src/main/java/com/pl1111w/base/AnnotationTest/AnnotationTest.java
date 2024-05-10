package AnnotationTest;

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
    public int number;
}
class AnnotationChildTest extends AnnotationTest{

    private String name;

    AnnotationChildTest(int number,String name) {
        super(number);
    }

    public static void main(String[] args) throws NoSuchFieldException {
         Class cla = AnnotationChildTest.class;
        Field field = cla.getField("number");
        Annotation[] declaredFieldAnnotations = field.getAnnotations();
        Annotation annotations[] = cla.getAnnotations();
         for(Annotation annotation:annotations){
             System.out.println(annotation.toString());
         }
    }
}
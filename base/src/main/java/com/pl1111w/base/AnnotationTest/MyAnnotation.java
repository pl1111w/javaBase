package com.pl1111w.base.AnnotationTest;

import java.lang.annotation.*;

/**
 * @title: pl1111w
 * @description: 元注解
 * @author: Kris
 * @date 2021/11/14 12:55
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE})
@Inherited
public @interface MyAnnotation {
}

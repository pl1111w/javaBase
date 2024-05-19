package reflection;

/**
 * @title: pl1111w
 * @description: 反射就是从类（字段 构造方法 成员方法）里面拿东西
 * @author: Kris
 * @date 2021/12/14 22:10
 */
public class GetClasses {

    public static void main(String[] args) throws ClassNotFoundException {
        GetClasses getClass = new GetClasses();
        Class aClass = getClass.getClass();

        Class aClass1 = GetClasses.class;

        //最为常用
        Class aClass2 = Class.forName("reflection.GetClasses");

        ClassLoader classLoader = GetClasses.class.getClassLoader();
        Class aClass3 = classLoader.loadClass("reflection.GetClasses");

        System.out.println(aClass==aClass1);
        System.out.println(aClass3==aClass1);
        System.out.println(aClass3==aClass2);
    }

}

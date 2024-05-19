package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/12/13 21:53
 */
public class ReflectionTest {

    public static void main(String[] args) throws Exception {
        Player player = new Player("su_bing_tian",33);
        player.name="gu_ai_ling";
        //外部对象不能修改私有属性，不能调用私有方法、创建私有构造器
        System.out.println(player.showPublicMethod());


        System.out.println("************reflection**************");
        Class clazz = Player.class;
        Constructor constructor = clazz.getDeclaredConstructor(int.class,String.class,int.class);
        constructor.setAccessible(true);
        Object object = constructor.newInstance(190,"zhuTing",29);
        player = (Player)object;
        System.out.println(player);

        Field field = clazz.getDeclaredField("id");
        field.setAccessible(true);
        field.set(player,198);
        System.out.println(player);
        Method privateMethod = clazz.getDeclaredMethod("showPrivateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(player);
    }
}

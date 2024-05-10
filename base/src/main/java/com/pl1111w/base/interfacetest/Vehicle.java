package interfacetest;

/**
 * @title: pl1111w
 * @description: jdk7:接口只能定义静态常量 跟抽象方法
 * @author: Kris
 * @date 2021/9/16 17:30
 */
public interface Vehicle {

    public static final int MAX_SPEED = 7900;

    public abstract int speed();

    public abstract String vehicleType();
}

package abstractclass;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/9/13 23:20
 */
public class People extends Animal{
    @Override
    String eat() {
        return "粮食";
    }

    @Override
    String breath() {
        return "肺呼吸";
    }

    @Override
    String sleep() {
        return "8h";
    }
    static void eat(Fish fish){
        System.out.println("eat"+fish.type);
    }
}

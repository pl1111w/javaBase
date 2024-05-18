package dynamicProxy.dynamic;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/12/28 18:05
 */
public class Dog implements Animals{
    @Override
    public void isEatMeat() {
        System.out.println("dog is eat meat");
    }

    @Override
    public void isPeopleFriend() {
        System.out.println("dog is people's friend");
    }
}

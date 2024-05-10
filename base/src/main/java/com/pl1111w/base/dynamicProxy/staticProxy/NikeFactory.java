package dynamicProxy.staticProxy;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/12/28 17:18
 */
public class NikeFactory implements ClothFactory{

    @Override
    public void makeCloth() {
        System.out.println("nike make nike shoes");
    }
}

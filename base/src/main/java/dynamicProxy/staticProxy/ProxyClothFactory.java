package dynamicProxy.staticProxy;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/12/28 17:19
 */
public class ProxyClothFactory implements ClothFactory {

    private ClothFactory clothFactory;

    public ProxyClothFactory(ClothFactory clothFactory) {

        this.clothFactory = clothFactory;
    }


    @Override
    public void makeCloth() {
        System.out.println("ready production");
        clothFactory.makeCloth();
        System.out.println("finish production");
    }
}

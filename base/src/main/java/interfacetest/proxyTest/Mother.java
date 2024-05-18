package interfacetest.proxyTest;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/9/17 16:42
 */
public class Mother implements Teacher{
    @Override
    public void checkHomework() {
        System.out.println("Mother checking");
    }
}

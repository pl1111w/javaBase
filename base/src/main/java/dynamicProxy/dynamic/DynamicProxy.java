package dynamicProxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/12/28 18:06
 */
public class DynamicProxy {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animals proxyInstance = ProxyFactory.getProxyInstance(dog);
        proxyInstance.isEatMeat("bone");
        proxyInstance.isPeopleFriend();

    }
}
//代理类
class ProxyFactory {

    public static Animals getProxyInstance(Object object) { //被代理类对象
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        myInvocationHandler.bind(object);
        //生成代理对象
        return (Animals) Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), myInvocationHandler);
    }
}

class MyInvocationHandler implements InvocationHandler {

    private Object object; //被代理类

    public void bind(Object object) {
        this.object = object;
    }

    //当通过代理类对象调用时，就会自动调用如下方法invoke
    /**
     * proxy: 代理的对象
     * method: 要运行的方法
     * args: 传递的实参
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("isEatMeat".equals(method.getName())){
            System.out.println("Does dog eat meat ?");
        }
        if("isPeopleFriend".equals(method.getName())){
            System.out.println("Does dog is people's friends ?");
        }
        Object returnValue =  method.invoke(object,args);
        return returnValue;
    }
}
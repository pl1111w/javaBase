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
        Animals proxyInstance = (Animals) ProxyFactory.getProxyInstance(dog);
        proxyInstance.isEatMeat();
        proxyInstance.isPeopleFriend();

    }
}

class ProxyFactory {



    public static Object getProxyInstance(Object object) { //被代理类对象
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        myInvocationHandler.bind(object);
        //生成代理对象
        Object proxyInstance = Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), myInvocationHandler);
        return proxyInstance;
    }
}

class MyInvocationHandler implements InvocationHandler {

    private Object object; //被代理类

    public void bind(Object object) {
        this.object = object;
    }

    //当通过代理类对象调用a时，就会自动调用如下方法invoke
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object returnValue =  method.invoke(object,args);
        return returnValue;
    }
}
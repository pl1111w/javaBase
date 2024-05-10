package jvm.stack;

/**
 * @title: pl1111w
 * @description: judge StringBuilder is thread safe
 * @author: Kris
 * @date 2023/5/29 17:31
 */
public class ThreadSafeStringBuilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(4);
        sb.append(5);
        new Thread(()->{
            m2(sb);
        });
    }

    /*
    *  safe 没有逃离方法作用域
    * */
    public static void m1() {
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.append(1);
        sb.append(1);
        System.out.println(sb);
    }
    /*
     *  unsafe 入参逃离方法作用域
     * */
    public static void m2(StringBuilder sb) {
        sb.append(1);
        sb.append(1);
        sb.append(1);
        System.out.println(sb);
    }

    /*
     *  unsafe 出参逃离方法作用域
     * */
    public static StringBuilder m3() {
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.append(1);
        sb.append(1);
        return sb;

    }
}

package jvm.shallow_deep_copy;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2023/4/19 13:10
 */
public class Girl implements Cloneable {

    private String name;

    private int age;

    private Work work;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        // return super.clone();
        Girl girl = (Girl) super.clone();
        Work work = (Work) this.work.clone();
        girl.setWork(work);
        return girl;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", work=" + work +
                '}';
    }
}

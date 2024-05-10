package jvm.shallow_deep_copy;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2023/4/19 13:11
 */
public class Work implements Cloneable {

    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override

    protected Object clone() throws CloneNotSupportedException {

        return super.clone();

    }
    @Override
    public String toString() {
        return "Work{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

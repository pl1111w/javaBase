package mapTest;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/11/22 17:18
 */
public class TreeData implements Comparable {

    private Integer id;

    private String name;

    public TreeData(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "TreeData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof TreeData) {
            if (this.id > ((TreeData) o).getId()) {
                return 1;
            } else {
                return -1;
            }
        } else {
            throw new RuntimeException("TreeData type not match");
        }

    }

    public Integer getId() {
        return id;
    }
}

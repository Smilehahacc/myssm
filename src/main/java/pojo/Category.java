package pojo;

import java.util.List;

/**
 * 商品类别的实体类<br>
 * 〈〉
 *
 * @author 景景
 * @create 2019/3/20
 * @since 1.0.0
 */
public class Category {
    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Category [id=" + id + ", name=" + name + "]";
    }

}

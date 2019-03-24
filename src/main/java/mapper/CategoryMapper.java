package mapper;

/**
 * 〈数据库操作配置文件的对应操作方法的映射〉<br>
 * 〈〉
 *
 * @author 景景
 * @create 2019/3/24
 * @since 1.0.0
 */
import pojo.Category;
import util.Page;

import java.util.List;

public interface CategoryMapper {

    public int add(Category category);

    public void delete(int id);

    public Category get(int id);

    public int update(Category category);

    public List<Category> list();

}

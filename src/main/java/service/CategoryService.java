package service;

/**
 * 〈实现service类的接口〉<br>
 * 〈〉
 *
 * @author 景景
 * @create 2019/3/22
 * @since 1.0.0
 */

import pojo.Category;
import util.Page;

import java.util.List;
public interface CategoryService {

    List<Category> list();
    void addTwo();
    void deleteAll();
}
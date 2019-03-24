package service.impl;

/**
 * 〈由注解标记的一个service类〉<br>
 * 〈〉
 *
 * @author 景景
 * @create 2019/3/22
 * @since 1.0.0
 */

import mapper.CategoryMapper;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.CategoryService;

import java.util.List;

@Service
public class CategoryServiceImpl  implements CategoryService{
    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public List<Category> list(){
        return categoryMapper.list();
    }
    @Override
    public void deleteAll() {
        List<Category> cs = list();
        for (Category c : cs) {
            categoryMapper.delete(c.getId());
        }
    }

    @Override
    @Transactional(propagation= Propagation.REQUIRED,rollbackForClassName="Exception")
//    以上为为此方法加上事务注解
    public void addTwo() {

        Category c1 = new Category();
        c1.setName("短的名字");
        categoryMapper.add(c1);

        Category c2 = new Category();
        c2.setName("名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,");
        categoryMapper.add(c2);
    };

}
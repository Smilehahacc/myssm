package test;

/**
 * 〈Mybatis的测试集〉<br>
 * 〈〉
 *
 * @author 景景
 * @create 2019/3/20
 * @since 1.0.0
 */
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import mapper.CategoryMapper;
import pojo.Category;
import service.CategoryService;
import util.Page;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void testAddTwo() {
        categoryService.deleteAll();
        categoryService.addTwo();

    }
}
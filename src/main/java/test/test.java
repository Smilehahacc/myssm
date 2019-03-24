package test;

/**
 * 〈需要Mybatis.xml文件的测试类〉<br>
 * 〈〉
 *
 * @author 景景
 * @create 2019/3/20
 * @since 1.0.0
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.Category;
import sun.util.resources.cldr.te.CalendarData_te_IN;

public class test {

    public static void main(String[] args) throws IOException {
//        根据配置文件mybatis-config.xml得到sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        根据sqlSessionFactory 得到session
        SqlSession session=sqlSessionFactory.openSession();

        List<Category> cs = session.selectList("list");
        for (Category c : cs) {
            System.out.println(c.getId()+" 对应的分类是 \t "+ c.getName());
        }

        System.out.println("finish!");
        session.commit();
        session.close();
    }
}
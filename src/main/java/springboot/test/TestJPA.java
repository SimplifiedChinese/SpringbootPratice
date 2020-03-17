package springboot.test;
import java.util.List;
 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import springboot.Application;
import springboot.dao.CategoryDAO;
import springboot.pojo.Category;
 
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestJPA {
 
    @Autowired CategoryDAO dao;
     
    @Test
    public void test() {
        List<Category> cs=  dao.findAll();
        for (Category c : cs) {
            System.out.println("c.getName():"+ c.getName());
        }
         
    }
}
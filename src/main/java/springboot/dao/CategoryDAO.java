package springboot.dao;
import org.springframework.data.jpa.repository.JpaRepository;
 
import springboot.pojo.Category;
 
public interface CategoryDAO extends JpaRepository<Category,Integer>{
 
}
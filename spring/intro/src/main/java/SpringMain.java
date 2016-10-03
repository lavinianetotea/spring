import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.ProductService;

/**
 * Created by trufanl on 03/10/2016.
 */
public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService = applicationContext.getBean(ProductService.class);

        System.out.println(productService.createProduct());
    }
}

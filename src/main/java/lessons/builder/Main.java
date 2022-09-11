package lessons.builder;

/**
 * @Author Александр Ключка
 * @created 2022-09-04  23:34
 **/

import lessons.api.lesson5.ApiSearchResult;
import lessons.api.lesson4.ApiUserConnectRequest;
import lessons.api.lesson5.ApiUserConnectResult;
import lessons.api.lesson5.SpoonaccularService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//        SpoonaccularService spoonaccularService = new SpoonaccularService();
//        ApiSearchResult recipes = spoonaccularService.findRecipes("Bread", 3);
//        System.out.println(recipes);
//
//        ApiUserConnectResult connectResult = spoonaccularService.connect(new ApiUserConnectRequest());
//        System.out.println(connectResult);

        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder()
                .build(Resources.getResourceAsStream("myBatisConfig.xml"));

    //   try (SqlSession session = sessionFactory.openSession()) {
    //       ProductsMapper productsMapper = session.getMapper(ProductsMapper.class);
    //       CategoriesMapper categoriesMapper = session.getMapper(CategoriesMapper.class);
    //       Products product = productsMapper.selectByPrimaryKey(444L);
    //       System.out.println(product);
    //       Categories category = categoriesMapper.selectByPrimaryKey(product.getCategoryId());
    //       System.out.println(category);

        }

    }

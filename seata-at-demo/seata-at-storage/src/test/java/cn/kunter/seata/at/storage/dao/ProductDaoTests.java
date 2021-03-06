package cn.kunter.seata.at.storage.dao;

import cn.kunter.seata.at.storage.eo.Product;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Product Dao Test
 * @author nature
 * @version 1.0 2020/6/28
 */
@Slf4j
@SpringBootTest
class ProductDaoTests {

    @Resource
    private ProductDao productDao;

    @Test
    void contextLoads() {
        assertNotNull(productDao);
    }

    @Test
    void testSelectById() {
        Long id = 1l;
        Product product = productDao.selectById(id);
        assertNotNull(product);
        log.info(JSON.toJSONString(product));
    }

    @Test
    void testSelectList() {
        QueryWrapper queryWrapper = new QueryWrapper();
        List<Product> productList = productDao.selectList(queryWrapper);
        assertNotNull(productList);
        log.info(JSON.toJSONString(productList));
    }

}
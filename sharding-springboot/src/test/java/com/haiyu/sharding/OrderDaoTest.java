package com.haiyu.sharding;

import com.haiyu.sharding.dao.OrderDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Desc:
 * @Author: liuxing
 * @Date: 2020/4/19 13:50
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ShardingApplication.class})
public class OrderDaoTest {

    @Autowired
    private OrderDao orderDao;

    @Test
    public void testInsertOrder(){
        for(int i=2;i<20;i++){
            orderDao.insertOrder(new BigDecimal(i),1L,"success");
        }
    }

    @Test
    public void testSelectOrderbyIds(){
        List<Long> ids = new ArrayList<>();
        ids.add(458631002261028864L);
        ids.add(458630573456359425L);

        List<Map> maps = orderDao.selectOrderbyIds(ids);
        System.out.println(maps);
    }
}

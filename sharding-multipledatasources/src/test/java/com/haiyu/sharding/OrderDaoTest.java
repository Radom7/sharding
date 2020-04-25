package com.haiyu.sharding;

import com.haiyu.sharding.dao.DictDao;
import com.haiyu.sharding.dao.OrderDao;
import com.haiyu.sharding.dao.UserDao;
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
@SpringBootTest(classes = {ShardingMultipledatasourcesApplication.class})
public class OrderDaoTest {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private UserDao userDao;

    @Autowired
    private DictDao dictDao;

    @Test
    public void testInsertOrder(){
        for(int i=2;i<20;i++){
            orderDao.insertOrder(new BigDecimal(i),2L,"success");
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

    @Test
    public void selectOrderbyUserAndIds(){
        List<Long> ids = new ArrayList<>();
        ids.add(458664029070557184L);
//        ids.add(458664028743401473L);

        List<Map> maps = orderDao.selectOrderbyUserAndIds(2L,ids);
        System.out.println(maps);
    }

    @Test
    public void testInsertUser(){
        for (int i = 11; i<15; i++){
            Long id = i + 1L;
            userDao.insertUser(id,"姓名"+ id );
        }
    }

    @Test
    public void testSelectUserbyIds(){
        List<Long> userIds = new ArrayList<>();
        userIds.add(11L);
        userIds.add(12L);
        List<Map> users = userDao.selectUserbyIds(userIds);
        System.out.println(users);
    }

    @Test
    public void testSelectUserInfobyIds(){
        List<Long> userIds = new ArrayList<>();
        userIds.add(11L);
//        userIds.add(4L);
        List<Map> users = userDao.selectUserInfobyIds(userIds);
        System.out.println(users);
    }

    @Test
    public void testInsertDict(){
        dictDao.insertDict(3L,"user_type","2","超级管理员");
        dictDao.insertDict(4L,"user_type","3","二级管理员");
    }

    @Test
    public void testDeleteDict(){
        dictDao.deleteDict(3L);
        dictDao.deleteDict(4L);
    }

}

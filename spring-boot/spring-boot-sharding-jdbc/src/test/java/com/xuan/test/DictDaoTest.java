package com.xuan.test;

import com.xuan.spring.boot.sharding.jdbc.ShardingJdbcApplication;
import com.xuan.spring.boot.sharding.jdbc.common.model.Dict;
import com.xuan.spring.boot.sharding.jdbc.common.model.User;
import com.xuan.spring.boot.sharding.jdbc.mapper.DictDao;
import com.xuan.spring.boot.sharding.jdbc.mapper.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShardingJdbcApplication.class)
public class DictDaoTest {

    @Resource
    private DictDao dictDao;

    @Test
    public void getAll() {
        List<Integer> ids = new ArrayList<>();
        List<Dict> all = dictDao.selectBatchIds(ids);
        System.out.println(all.toString());
    }

    @Test
    public void insert() {
        Dict dict = Dict.builder().dictId(3).type("3").code("1003").value("英语").build();
        dictDao.insert(dict);
    }
    @Test
    public void delete() {
        dictDao.deleteById(1);
    }

    @Test
    public void update() {
        Dict dict = Dict.builder().dictId(3).type("3").code("1003").value("英语111").build();
        dictDao.updateById(dict);
    }

}

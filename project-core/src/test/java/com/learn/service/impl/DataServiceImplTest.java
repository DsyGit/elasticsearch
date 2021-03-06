package com.learn.service.impl;

import com.learn.common.constant.ServiceResult;
import com.learn.mbg.mapper1.ViewMapper1;
import com.learn.service.DataService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @author dshuyou
 * @date 2019/12/4 22:41
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DataServiceImplTest {
    @Autowired
    private DataService dataService;

    @Test
    public void findOne() {
        String table = "comments";
        String pk = "comment_id";
        String id = "12";
        String database = "database1";

        ServiceResult res = dataService.findOne(database,table,pk,id);
        System.out.println(res.getResult());
    }

    @Test
    public void selectIndex() {
    }
}
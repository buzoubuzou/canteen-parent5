package com.hengkun.test;

import com.hengkun.untils.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisUtilTest {
    @Autowired
    private RedisUtil redisUtil;
    @Test
    public void testSet(){
        String key="key";
        System.out.println(redisUtil.get(key));
        String value="string";
        redisUtil.set(key,value);
        System.out.println("从缓存中取值");
        System.out.println(redisUtil.get(key));

    }
}

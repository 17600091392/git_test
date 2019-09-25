package com.baizhi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GitTestApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("打印一行");
        System.out.println("github上添加的内容");
        System.out.println("员工1进行了开发");
    }

}

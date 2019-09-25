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
        int a=100;
        System.out.println("员工2设置了一个变量");
        System.out.println("员工2 使用技能 打鼾 生命值恢复了");
        System.out.println("员工2 醒了");
    }

}

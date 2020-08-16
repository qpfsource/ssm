package cn.qpfsource.test;

import cn.qpfsource.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 */
public class TestSpring {
    @Test
    public void test1(){
        /**
            加载Spring的配置文件，获取对象并调用方法
         */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService accountService = (AccountService)applicationContext.getBean("accountService");
        accountService.findAll();
    }
}

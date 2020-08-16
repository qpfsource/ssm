package cn.qpfsource.test;

import cn.qpfsource.dao.AccountDao;
import cn.qpfsource.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * 测试Mybatis
 */
public class TestMybatis {
    @Test
    public void test1 () throws Exception{
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取代理对象
        AccountDao dao = sqlSession.getMapper(AccountDao.class);
        //查询所有的账户信息
        List<Account> accountList = dao.findAll();
        //提交事务,执行增\删\改时需要手动提交事务
        sqlSession.close();
        in.close();
//        //遍历打印输出账户信息
        for (Account account:accountList) {
            System.out.println(account);

        }
    }
}

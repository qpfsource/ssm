package cn.qpfsource.service;

import cn.qpfsource.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Account接口,使用注解配置方式
 */
public interface AccountService {
    //查询所有用户
    List<Account> findAll();
    //保存账户信息
    void saveAccount(Account account);
}

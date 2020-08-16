package cn.qpfsource.service.impl;

import cn.qpfsource.dao.AccountDao;
import cn.qpfsource.domain.Account;
import cn.qpfsource.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service的实现类,使用注解配置
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        List<Account> all = accountDao.findAll();
        return all;
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层保存用户信息");

    }
}

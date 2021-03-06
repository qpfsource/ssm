package cn.qpfsource.dao;

import cn.qpfsource.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户查询接口
 */
@Repository
public interface AccountDao {
    //查询所有用户
    @Select("Select * from account")
    List<Account> findAll();
    //保存账户信息
    @Insert("insert into account (name,money) values (#{name},#{money})")
    void saveAccount(Account account);
}

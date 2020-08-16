package cn.qpfsource.controller;

import cn.qpfsource.domain.Account;
import cn.qpfsource.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 账户web的控制器
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
//        System.out.println("表现层:查询所有的用户信息...");
        //调用业务层Service层的方法
        List<Account> accounts = accountService.findAll();
        model.addAttribute("list",accounts);
        return "list";
    }
}

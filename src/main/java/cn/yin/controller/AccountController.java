package cn.yin.controller;

import cn.yin.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    /**
     * @methodName：login
     * @author: yin
     * @date: 2020/9/15  20:14
     * @param：
     * @return：
     * @throws:
     * @description: 登陆的controller方法
     */
    @RequestMapping("/login")
    public String login(){
        return "account/login";
    }

    @RequestMapping("/loginOut")
    public String loginOut(HttpServletRequest request){
        accountService.loginOut(request);
        return "index";
    }

    @RequestMapping("/validateAccount")
    @ResponseBody
    public String validateAccount(HttpServletRequest request,String loginName,String password){

        System.out.println("尝试验证用户 账号：" + loginName + " 密码：" + password);

        return accountService.validateAccount(request,loginName, password);
    }

    @RequestMapping("/accountInfo")
    public String accountInfo(){
        return "account/accountInfo";
    }
}

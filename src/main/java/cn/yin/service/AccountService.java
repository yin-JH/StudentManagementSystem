package cn.yin.service;

import cn.yin.entity.Account;
import cn.yin.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountMapper accountMapper;

    public String validateAccount(HttpServletRequest request, String loginName, String password) {
        List<Account> accountList = accountMapper.findAccountByLoginNameAndPassword(loginName, password);

        if(accountList.size() > 0){
            request.getSession().setAttribute("account",accountList.get(0));
            return "success";
        }
        else return "fail";
    }

    /**
     * @methodName：loginOut
     * @author: yin
     * @date: 2020/9/15  20:19
     * @param：HttpServletRequest request
     * @return：
     * @throws:
     * @description: 退出登陆的方法,学到了一个细节，如果get的attribute不存在的话就会被创造一个
     *                并且被赋予的值是null
     */
    public void loginOut(HttpServletRequest request) {
        //首先判断是否存在账号，存在就退出，不存在就直接返回
        Object account = request.getSession().getAttribute("account");
        if (account != null) {
            request.getSession().setAttribute("account",null);
        }
    }
}

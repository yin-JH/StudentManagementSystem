package cn.yin.mapper;

import cn.yin.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface AccountMapper {
    List<Account> findAccountByLoginNameAndPassword(@Param("loginName") String loginName, @Param("password") String password);
}

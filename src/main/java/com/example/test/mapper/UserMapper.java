package com.example.test.mapper;

import com.example.test.bean.UserBean;
import org.springframework.stereotype.Repository;

//访问数据库接口
@Repository
public interface UserMapper {
    UserBean getInfo(String name,String password);

    UserBean queryUserBeanByName(String name);
}

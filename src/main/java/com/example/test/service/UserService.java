package com.example.test.service;

import com.example.test.bean.UserBean;
import com.example.test.vo.ResultInfo;

//业务
public interface UserService {
    ResultInfo loginIn(String name, String password);
}

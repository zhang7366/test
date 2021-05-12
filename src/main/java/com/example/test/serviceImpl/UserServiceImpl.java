package com.example.test.serviceImpl;

import com.example.test.bean.UserBean;
import com.example.test.mapper.UserMapper;
import com.example.test.service.UserService;
import com.example.test.vo.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//实现业务层
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public ResultInfo loginIn(String name, String password) {
        ResultInfo resultInfo=new ResultInfo();

        //回显信息
        UserBean u=new UserBean();
        u.setName(name);
        u.setPassword(password);
        resultInfo.setResult(u);

        //判断对象是否存在
        UserBean userBean=userMapper.queryUserBeanByName(name);
        if(userBean==null){
            resultInfo.setCode(0);
            resultInfo.setSmg("用户不存在!");
            return resultInfo;
        }

        //获取用户密码
        String password1 = userBean.getPassword();

        if (!password1.equals(password)) {
            resultInfo.setCode(0);
            resultInfo.setSmg("用户密码错误!");
            return resultInfo;
        }

        resultInfo.setCode(1);
        resultInfo.setResult(userBean);
        return resultInfo;
    }
}

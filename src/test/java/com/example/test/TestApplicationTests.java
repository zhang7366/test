package com.example.test;

import com.example.test.service.UserService;
import com.example.test.vo.ResultInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {
        @Autowired
        UserService userService;
        @Test
        public void contestLoads(){
                ResultInfo resultInfo = userService.loginIn("a", "a");

                if (resultInfo.getCode()==1){
                        System.out.println("登录成功!"+resultInfo.getResult());
                }else{
                        System.out.println("登录失败");
                }

////                if(userBean ==null){
////                        System.out.println("该用户不存在！");
////                }
//                System.out.println("该用户的ID是:");
//                System.out.println(userBean.getId());


        }

}

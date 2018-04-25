package com.server;

import com.bean.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@Api(value = "/", description = "这是我全部的post请求")
public class MyPostMethod {

    //这个变量时用来装我们cookies信息的
    private static Cookie cookie;

    //用户登陆成功取到cookies，然后再访问其他接口获取到列表
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ApiOperation(value = "登录接口，成功后获取cookies信息", httpMethod = "POST")
    public String login(HttpServletResponse response, @RequestParam(value = "username", required = true) String userName, @RequestParam(value = "password", required = true) String password){
        if(userName.equals("Jean") && password.equals("123")){
            cookie = new Cookie("login", "true");
            response.addCookie(cookie);
            return "恭喜登录成功";
        }
        return "用户名或密码错误";
    }

    @RequestMapping(value = "/getUserList", method = RequestMethod.POST)
    @ApiOperation(value = "获取用户列表", httpMethod = "POST")
    public String getUserList(HttpServletRequest request, @RequestBody User u){
        //获取Cookies
        Cookie[] cookies = request.getCookies();
        //验证cookies是否合法
        for(Cookie c: cookies){
            if(c.getName().equals("login")
                    && c.getValue().equals("true")
                    && u.getUsername().equals("Jean")
                    && u.getPassword().equals("123")){
                User user = new User();
                user.setName("lisi");
                user.setAge("18");
                user.setSex("man");
                return user.toString();
            }
        }
        return "参数不合法";
    }
}

package com.server;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@Api(value = "/", description = "这是我全部的get方法")
public class MyGetMethod {

    @RequestMapping(value = "/getCookies", method = RequestMethod.GET)
    @ApiOperation(value = "通过这个方法可以获取到Cookies", httpMethod = "GET")
    public String getCookies(HttpServletResponse response){
        //HttpServerltRequest 装请求信息的类
        //HttpServerletResponse 装响应信息的类
        Cookie cookie = new Cookie("login", "true");
        response.addCookie(cookie);
        return "获得cookies信息成功";
    }

    /**
     * 要求客户端携带cookies访问
     * 这是一个需要携带cookies信息才能访问的get请求
     */
    @RequestMapping(value = "/get/with/cookies", method = RequestMethod.GET)
    @ApiOperation(value = "要求客户端携带cookies访问", httpMethod = "GET")
    public String getWithCookies(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if(Objects.isNull(cookies)){
            return "必须携带cookies信息来";
        }
        for(Cookie cookie: cookies){
            System.out.println(cookie.getName());
            System.out.println(cookie.getValue());
            if(cookie.getName().equals("login") && cookie.getValue().equals("true")){
                return "恭喜你访问成功";
            }
        }
        return "你必须携带cookies信息来";
    }

    /**
     * 开发一个需要携带参数才能访问的get请求
     * 第一种实现方式url: key=value&key=value
     * 模拟获取商品列表
     */
    @RequestMapping(value = "/get/with/param", method = RequestMethod.GET)
    @ApiOperation(value = "开发一个需要携带参数才能访问的get请求方法一", httpMethod = "GET")
    public Map<String, Integer> getList(@RequestParam Integer start, @RequestParam Integer end){
        Map<String, Integer> myList = new HashMap<>();
        myList.put("鞋", 400);
        myList.put("干脆面", 1);
        myList.put("裙子", 200);
        return myList;
    }

    /**
     * 第二种需要携带参数访问的get请求
     * url: ip:port/get/with/param/10/20
     */
    @RequestMapping(value = "/get/with/param/{start}/{end}")
    @ApiOperation(value = "开发一个需要携带参数才能访问的get请求方法二", httpMethod = "GET")
    public Map<String, Integer> myGetList(@PathVariable Integer start, @PathVariable Integer end){
        Map<String, Integer> shopList = new HashMap<>();
        shopList.put("手机", 400);
        shopList.put("充电线", 1);
        shopList.put("耳机", 200);
        return shopList;
    }
}

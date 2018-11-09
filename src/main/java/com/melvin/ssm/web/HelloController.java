package com.melvin.ssm.web;

import com.google.gson.Gson;
import com.melvin.ssm.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.Map;

@Controller
@RequestMapping("/hello")
public class HelloController {


    @RequestMapping("/test")
    @ResponseBody
    public Map<String,String> test(){
        return Collections.singletonMap("message","Hello,World!!!");
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    @ResponseBody
    public String pstUser(@RequestBody User user){
        Gson gson=new Gson();
        return gson.toJson(user,User.class);
    }
}

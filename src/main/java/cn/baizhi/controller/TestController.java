package cn.baizhi.controller;

import cn.baizhi.config.BeanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("boot")
public class TestController {
    @Autowired
    private BeanConfig bf;
    @RequestMapping("test")
    @ResponseBody
    public String test() throws Exception {
        System.out.println(bf.getUser());
        System.out.println(bf.getCon());
        return "aaa";
    }
    @RequestMapping("test2")
    public String test2(){
        return "index";
    }
}

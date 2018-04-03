package com.ibm.boots.controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class HelloController {  

    @RequestMapping(value="/hello", method=RequestMethod.GET)  
    public String HelloController() {  
        return "Hello World! I am Xuan,This is a first class for Spring Boots";  
    }  
    
    @RequestMapping("/")
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://blog.didispace.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";  
    }

}  
package com.example.test.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/t")
public class SptestController {

    @RequestMapping("/page1")
    public String page1(){
        return "/page1";
    }

    @RequestMapping(value = "/job1", method= RequestMethod.POST)
    @ResponseBody
    public String job1(
            @ModelAttribute TestModel testModel,
            HttpServletRequest request, HttpSession session){
        return "success";
    }

}

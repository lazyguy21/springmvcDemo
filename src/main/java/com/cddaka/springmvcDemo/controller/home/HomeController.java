package com.cddaka.springmvcDemo.controller.home;

import com.cddaka.springmvcDemo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * Created by lazyguy on 2016-3-14.
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping("/testPath")
    public ModelAndView testPath(HttpServletRequest request){
        String contextPath = request.getContextPath();
        System.out.println(contextPath);
        ModelAndView modelAndView = new ModelAndView();

        return new ModelAndView(new RedirectView(request.getContextPath()+"/home/test"));
    }
    @RequestMapping("/test")
    public ModelAndView test(User user,HttpSession httpSession){
        ModelAndView modelAndView = new ModelAndView();
        httpSession.setAttribute("memberId","asdfhashdf");
        User user1 = new User();
        user1.setId(111L);
        user1.setName("wowowowoa!");
        httpSession.setAttribute("user1",user1);
        modelAndView.setViewName("/home/test");
        return modelAndView;
    }
    @RequestMapping("/testSession")
    @ResponseBody
    public Object  testSession(HttpSession httpSession){
        System.out.println(httpSession);
        Object memberInfo = httpSession.getAttribute("memberInfo");
        System.out.println(memberInfo);
        return memberInfo;
    }
    @RequestMapping("/testUser")
    @ResponseBody
    public Object  testUser(@RequestParam(required = false) Integer name, User user, BindingResult result){
        if (result.hasErrors()){
            FieldError fieldError = result.getFieldError();
            return fieldError;
        }
        return "xxxxxx";
    }
    @RequestMapping("/setSession")
    @ResponseBody
    public Object  testSetSession(HttpSession httpSession){
        httpSession.setAttribute("name","caoccaocoaocoaocao");
        return "xxxxxx";
    }
    @RequestMapping("/getSession")
    @ResponseBody
    public Object  testGetSession(HttpSession httpSession){
        Object name = httpSession.getAttribute("name");
        System.out.println(name);
        return name;
    }
    @RequestMapping("/testDate")
    @ResponseBody
    public Object testDate(Date date){
        System.out.println(date);
        return date;
    }
    @RequestMapping("/testCaptcha")
    public String testCaptcha(){
        return "/home/test";
    }
}

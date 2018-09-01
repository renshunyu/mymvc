package com.rensy.mymvc.controller;

import com.rensy.mymvc.pojo.Person;
import com.rensy.mymvc.pojo.User;
import com.sun.org.glassfish.external.probe.provider.annotations.ProbeParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class ViewController {
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping(value="/get/{id}",method = RequestMethod.GET)
    @ResponseBody
    public String get(@PathVariable(value = "id")  String id){
        return "get"+id;
    }
    @RequestMapping(value="/post",method = RequestMethod.POST)
    @ResponseBody
    public String post(){
        return "post";
    }
    @RequestMapping(value="/put",method = RequestMethod.PUT)
    @ResponseBody
    public String put(){
        return "put";
    }
    @RequestMapping(value="/delete/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String delete( @PathVariable("id") String id){
        return "delete"+id;
    }
    @ResponseBody
    @RequestMapping("/body")
    public String body(@RequestParam(value= "id",required = true) String id , String name){
        return "id="+id+"name="+name;
    }

    @ResponseBody
    @RequestMapping("/body1")
    public String body1(User user){
        return user.toString();
    }
    @ResponseBody
    @RequestMapping("/body2")
    public String body1(Person person){
        return person.toString();
    }
    @ResponseBody
    @RequestMapping("/header")
    public String header(@RequestHeader(value = "Accept") String s){
        return s;
    }
    @ResponseBody
    @RequestMapping("/cookie")
    public String cookie(@CookieValue(value = "JSESSIONID") String s){
        return s;
    }

    @ResponseBody
    @RequestMapping("/servlet")
    public String servlet(HttpServletRequest httpServletRequest){
        httpServletRequest.setAttribute("asdas","sdf");
        return "${sessionScope.get(\"asdas\")}";
    }
    @RequestMapping("/modelAndView")
    public ModelAndView modelAndView(ModelAndView modelAndView){
        modelAndView.addObject("name","tom");
        modelAndView.setViewName("jsp/modelandview");
        return modelAndView;
    }
    @RequestMapping("/map")
    public String map(Map map){
        map.put("name","admin");
        map.put("age",123);
        return "jsp/map";
    }
    @RequestMapping("/model")
    public String model(Model model){
        model.addAttribute("name","admin");
        model.addAttribute("age",123);
        return "jsp/model";
    }
    @RequestMapping("/modelmap")
    public String modelMap(ModelMap modelMap){
        modelMap.addAttribute("name","admin");
        modelMap.addAttribute("age",123);
        return "jsp/modelmap";
    }


}

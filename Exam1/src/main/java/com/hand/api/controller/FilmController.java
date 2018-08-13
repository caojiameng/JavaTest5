package com.hand.api.controller;

import com.hand.api.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping(value = "/film")
public class FilmController {
    @Autowired
    private FilmService filmService;

    @RequestMapping(value = "/signin/{name}{password}",method = RequestMethod.POST)
    public void signIn(@PathParam("name") String name, @PathParam("password") String password){
        if(name.equals("b")&& password.equals("a")){
            System.out.println("登陆成功");
        }else{
            System.out.println("失败");
        }
    }
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public Object findAllUser(@RequestBody
            @RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,@RequestBody
            @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize
    ){
        return filmService.findAllUser(pageNum,pageSize);
    }
}

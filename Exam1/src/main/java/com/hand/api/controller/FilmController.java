package com.hand.api.controller;

import com.hand.api.service.CustomerService;
import com.hand.api.service.FilmService;
import com.hand.domain.eneity.Customer;
import com.hand.domain.eneity.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.awt.*;
import java.util.List;

@RestController
@RequestMapping(value = "/film")
public class FilmController {
    @Autowired
    private FilmService filmService;
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/signin/{name}{password}",method = RequestMethod.POST)
    public void signIn(@PathParam("name") String name, @PathParam("password") String password){
        List<Customer> customerList=customerService.findAllUser();
        for(Customer map : customerList){
            if (map.getFirstName().equals(name)&&map.getLastName().equals(password)){
                System.out.println("登陆成功");
            }

        }

    }
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public Object findAllUser(@RequestBody
            @RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,@RequestBody
            @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize
    ){
        return filmService.findAllUser(pageNum,pageSize);
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public int addUser(@RequestBody Film film){
        return filmService.addFilm(film);
    }
}

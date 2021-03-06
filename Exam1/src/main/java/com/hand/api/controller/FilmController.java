package com.hand.api.controller;

import com.hand.api.service.CustomerService;
import com.hand.api.service.FilmService;
import com.hand.api.service.PersonService;
import com.hand.domain.eneity.Customer;
import com.hand.domain.eneity.Film;
import com.hand.domain.eneity.Person;
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
    @Autowired
    private PersonService personService;

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
    public int addUser( @RequestBody Person person){
        return personService.addCustomer(person);
    }

    @RequestMapping(value = "/delete/{customerId}",method = RequestMethod.DELETE)
    public int deleteUser(@RequestBody @PathVariable Short customerId){
        return personService.deleteUser(customerId);
    }
    @PostMapping(value = "/update")
    //  @RequestMapping(value = "/update",method =RequestMethod.PUT)
    public int updateUser( Person user){
        return personService.updateById(user);
    }
    @RequestMapping(value = "/person/all",method = RequestMethod.GET)
    public Object findUser(@RequestBody
                              @RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,@RequestBody
                              @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize
    ){
        return personService.findAllUser(pageNum,pageSize);
    }

}

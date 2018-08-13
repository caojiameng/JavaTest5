package com.hand.api.controller;

import com.hand.api.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/film")
public class FilmController {
    @Autowired
    private FilmService filmService;
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize
    ){
        return filmService.findAllUser(pageNum,pageSize);
    }
}

package com.hand.api.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hand.api.service.FilmService;
import com.hand.domain.eneity.Film;
import com.hand.infra.mapper.FilmMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "filmService")
public class FilmServiceImpl implements FilmService {
    @Autowired
    private FilmMapper filmMapper;
    @Override
    public PageInfo<Film> findAllUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Film> users=filmMapper.selectUsers();
        PageInfo result =new PageInfo(users);
        return result;
    }
}

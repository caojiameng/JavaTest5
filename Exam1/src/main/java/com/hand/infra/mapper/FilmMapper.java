package com.hand.infra.mapper;

import com.hand.domain.eneity.Film;

import java.util.List;

public interface FilmMapper {
    int deleteByPrimaryKey(Short filmId);

    int insert(Film record);

    int insertSelective(Film record);

    Film selectByPrimaryKey(Short filmId);

    int updateByPrimaryKeySelective(Film record);
    List<Film> selectUsers();

    int updateByPrimaryKeyWithBLOBs(Film record);

    int updateByPrimaryKey(Film record);
}
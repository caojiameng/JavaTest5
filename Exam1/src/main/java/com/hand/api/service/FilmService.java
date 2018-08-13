package com.hand.api.service;

import com.github.pagehelper.PageInfo;
import com.hand.domain.eneity.Film;

public interface FilmService {
    PageInfo<Film> findAllUser(int pageNum, int pageSize);
    int addFilm(Film film);
}

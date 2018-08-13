package com.hand.infra.mapper;

import com.hand.domain.eneity.Film;
import com.hand.domain.eneity.Person;

import java.util.List;

public interface PersonMapper {
    int deleteByPrimaryKey(Short customerId);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Short customerId);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
    List<Person> selectUsers();
}
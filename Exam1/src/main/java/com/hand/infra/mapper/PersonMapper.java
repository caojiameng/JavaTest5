package com.hand.infra.mapper;

import com.hand.domain.eneity.Person;

public interface PersonMapper {
    int deleteByPrimaryKey(Short customerId);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Short customerId);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
}
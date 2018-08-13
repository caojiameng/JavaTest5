package com.hand.api.service.impl;

import com.hand.api.service.PersonService;
import com.hand.domain.eneity.Person;
import com.hand.infra.mapper.CustomerMapper;
import com.hand.infra.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "personService")
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;
    @Override
    public int addCustomer(Person customer) {
        return personMapper.insert(customer);
    }

    @Override
    public int deleteUser(Short customerId) {
        return personMapper.deleteByPrimaryKey(customerId);
    }

    @Override
    public int updateById(Person user) {
        return personMapper.updateByPrimaryKey(user);
    }
}

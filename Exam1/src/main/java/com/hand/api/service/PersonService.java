package com.hand.api.service;

import com.github.pagehelper.PageInfo;
import com.hand.domain.eneity.Customer;
import com.hand.domain.eneity.Film;
import com.hand.domain.eneity.Person;

public interface PersonService {
    int addCustomer(Person customer);

    int deleteUser(Short customerId);

    int updateById(Person user);
    PageInfo<Person> findAllUser(int pageNum, int pageSize);
}

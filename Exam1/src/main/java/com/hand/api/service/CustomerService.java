package com.hand.api.service;

import com.github.pagehelper.PageInfo;
import com.hand.domain.eneity.Customer;
import com.hand.domain.eneity.Film;

import java.util.List;

public interface CustomerService {
    List<Customer> findAllUser();
    int addCustomer(Customer customer);

    int deleteUser(Short customerId);

    int updateById(Customer user);
}

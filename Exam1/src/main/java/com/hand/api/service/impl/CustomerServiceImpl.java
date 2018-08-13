package com.hand.api.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hand.api.service.CustomerService;
import com.hand.domain.eneity.Customer;
import com.hand.domain.eneity.Film;
import com.hand.infra.mapper.CustomerMapper;
import com.hand.infra.mapper.FilmMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public List<Customer> findAllUser() {

        List<Customer> users=customerMapper.selectUsers();

        return users;
    }

    @Override
    public int addCustomer(Customer customer) {
        return customerMapper.insert(customer);
    }
    @Override
    public int deleteUser(Short customerId) {
        return customerMapper.deleteByPrimaryKey(customerId);
    }

    @Override
    public int updateById(Customer user) {
        return customerMapper.updateByPrimaryKey(user);
    }
}

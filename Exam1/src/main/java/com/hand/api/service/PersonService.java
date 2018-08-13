package com.hand.api.service;

import com.hand.domain.eneity.Customer;
import com.hand.domain.eneity.Person;

public interface PersonService {
    int addCustomer(Person customer);

    int deleteUser(Short customerId);

    int updateById(Person user);
}

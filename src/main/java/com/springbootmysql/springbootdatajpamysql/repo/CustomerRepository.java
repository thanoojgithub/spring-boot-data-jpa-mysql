package com.springbootmysql.springbootdatajpamysql.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootmysql.springbootdatajpamysql.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}

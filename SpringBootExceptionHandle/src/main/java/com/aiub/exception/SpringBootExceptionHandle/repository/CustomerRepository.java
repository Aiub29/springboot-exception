package com.aiub.exception.SpringBootExceptionHandle.repository;

import com.aiub.exception.SpringBootExceptionHandle.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

package com.example.cruduivaadin;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByLastNameStartsWithIgnoreCase(String lastName);

}

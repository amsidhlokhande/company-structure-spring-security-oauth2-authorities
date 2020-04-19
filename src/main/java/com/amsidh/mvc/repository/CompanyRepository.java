package com.amsidh.mvc.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.amsidh.mvc.entities.Company;
@Repository
public interface CompanyRepository {

    Company find(Long id);

    Company find(String name);

    List<Company> findAll();

    void create(Company company);

    Company update(Company company);

    void delete(Long id);

    void delete(Company company);
}

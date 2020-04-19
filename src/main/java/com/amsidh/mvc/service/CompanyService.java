package com.amsidh.mvc.service;

import java.util.List;

import com.amsidh.mvc.entities.Company;

public interface CompanyService {

    Company get(Long id);

    Company get(String name);

    List<Company> getAll();

    void create(Company company);

    Company update(Company company);

    void delete(Long id);

    void delete(Company company);
}

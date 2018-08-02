package com.jorgel.study.service;

import com.jorgel.study.model.Company;
import com.jorgel.study.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public Company save(@Validated Company company) {
        return companyRepository.save(company);
    }

    public Company findById(Long id){
        return companyRepository.findById(id).orElse(null);
    }

    public Iterable<Company> findAll(){
        return companyRepository.findAll();
    }

    public void delete(Long id) {
        companyRepository.deleteById(id);
    }

}

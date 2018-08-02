package com.jorgel.study.repository;

import com.jorgel.study.model.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Long> {
}

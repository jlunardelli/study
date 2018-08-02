package com.jorgel.study.controller;

import com.jorgel.study.model.Company;
import com.jorgel.study.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/company", produces = MediaType.APPLICATION_JSON_VALUE)
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Company> save(@RequestBody Company company){
        return ResponseEntity.ok(companyService.save(company));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Company> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok(companyService.findById(id));
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Iterable<Company>> findAll(){
        return ResponseEntity.ok().body(companyService.findAll());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> delete(@PathVariable("id") Long id){
        companyService.delete(id);
        return ResponseEntity.ok().build();
    }

}

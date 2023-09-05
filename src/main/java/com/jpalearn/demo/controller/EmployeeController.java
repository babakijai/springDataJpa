package com.jpalearn.demo.controller;

import com.jpalearn.demo.bean.EmployeeBusted;
import com.jpalearn.demo.entity.EmployeeEntity;
import com.jpalearn.demo.repository.EmployeeBustRepo;
import com.jpalearn.demo.services.SwapServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {


    @Autowired
    private EmployeeBustRepo employeeBustRepo;

    @PostMapping("/saveBustedEmployee")
    public List<EmployeeEntity> saveBustedEmployee(@RequestBody List<EmployeeEntity> swapCrewBusts){


        return employeeBustRepo.saveAll(swapCrewBusts);

    }
}

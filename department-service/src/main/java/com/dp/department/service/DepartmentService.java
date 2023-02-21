package com.dp.department.service;

import com.dp.department.entity.Department;
import com.dp.department.repository.DepartementRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartementRepository departementRepository;

    public Department saveDepartment(Department department){
        log.info("Inside saveDepartment method of DepartmentService");
        return departementRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Inside findDepartmentById method of DepartmentService");
        return departementRepository.findByDepartmentId(departmentId);
    }
}


package com.dp.department.repository;

import com.dp.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartementRepository extends JpaRepository<Department,Long> {
    Department findByDepartmentId(Long departmentId);
}

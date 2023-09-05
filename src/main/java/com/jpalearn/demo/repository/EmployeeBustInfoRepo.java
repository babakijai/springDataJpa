package com.jpalearn.demo.repository;

import com.jpalearn.demo.entity.EmployeeBustedInfoEntity;
import com.jpalearn.demo.entity.EmployeeBustInfoEntityPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeBustInfoRepo extends JpaRepository<EmployeeBustedInfoEntity, EmployeeBustInfoEntityPk> {
}

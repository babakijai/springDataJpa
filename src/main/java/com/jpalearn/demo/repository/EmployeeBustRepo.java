package com.jpalearn.demo.repository;

import com.jpalearn.demo.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeBustRepo extends JpaRepository<EmployeeEntity,Long> {

    @Query(value="select swap_seq.currval from dual;",nativeQuery = true)
    Long getBustSequenceId();
}

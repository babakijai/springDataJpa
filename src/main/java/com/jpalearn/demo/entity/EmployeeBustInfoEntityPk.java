package com.jpalearn.demo.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class EmployeeBustInfoEntityPk implements Serializable {

    @Column(name="BUST_I" )
    private Long bustId;

    @Column(name="EMPLOYEE_I")
    private Long employeeId;
    public Long getBustId() {
        return bustId;
    }

    public void setBustId(Long bustId) {
        this.bustId = bustId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }



}

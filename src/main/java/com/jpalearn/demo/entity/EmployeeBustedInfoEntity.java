package com.jpalearn.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "employee_busted_info")
public class EmployeeBustedInfoEntity implements Serializable {

    @EmbeddedId
    private EmployeeBustInfoEntityPk pk;

    @Column(name="EMPLOYEE_NAME")
    private String employeeName;

    @ManyToOne
    @JoinColumn(name = "BUST_I", referencedColumnName = "BUST_I", insertable = false, updatable = false)
    private EmployeeEntity employeeEntity;

    public EmployeeBustInfoEntityPk getPk() {
        return pk;
    }

    public void setPk(EmployeeBustInfoEntityPk pk) {
        this.pk = pk;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public EmployeeEntity getEmployeeEntity() {
        return employeeEntity;
    }

    public void setEmployeeEntity(EmployeeEntity employeeEntity) {
        this.employeeEntity = employeeEntity;
    }






}

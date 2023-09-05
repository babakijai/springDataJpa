package com.jpalearn.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "employee_busted")
public class EmployeeEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "employee_id_seq")
    @SequenceGenerator(
            name = "employee_id_seq", sequenceName = "employee_id_seq", allocationSize = 1)
    @Column(name="BUST_I")
    private Long bustId;

    @Column(name="REQUEST_I")
    private Long requestId;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "PK_CREWINFOID",referencedColumnName = "BUST_I")
    List<EmployeeBustedInfoEntity> employeeBustedInfoEntityList;

    public Long getBustId() {
        return bustId;
    }

    public void setBustId(Long bustId) {
        this.bustId = bustId;
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public List<EmployeeBustedInfoEntity> getEmployeeBustedInfoEntityList() {
        return employeeBustedInfoEntityList;
    }

    public void setEmployeeBustedInfoEntityList(List<EmployeeBustedInfoEntity> employeeBustedInfoEntityList) {
        this.employeeBustedInfoEntityList = employeeBustedInfoEntityList;
    }




}

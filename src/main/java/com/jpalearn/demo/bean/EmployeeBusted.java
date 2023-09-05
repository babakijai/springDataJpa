package com.jpalearn.demo.bean;

import java.util.List;

public class EmployeeBusted {


    private Long requestId;
    List<EmployeeBustInfo> employeeBustInfos;


    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public List<EmployeeBustInfo> getEmployeeBustInfos() {
        return employeeBustInfos;
    }

    public void setEmployeeBustInfos(List<EmployeeBustInfo> employeeBustInfos) {
        this.employeeBustInfos = employeeBustInfos;
    }
}

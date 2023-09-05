package com.jpalearn.demo.services;

import com.jpalearn.demo.bean.EmployeeBusted;
import com.jpalearn.demo.bean.EmployeeBustInfo;
import com.jpalearn.demo.entity.EmployeeEntity;
import com.jpalearn.demo.entity.EmployeeBustedInfoEntity;
import com.jpalearn.demo.entity.EmployeeBustInfoEntityPk;
import com.jpalearn.demo.repository.EmployeeBustInfoRepo;
import com.jpalearn.demo.repository.EmployeeBustRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



@Service
public class SwapServices {

    @Autowired
    EmployeeBustRepo employeeBustRepo;

    @Autowired
    EmployeeBustInfoRepo employeeBustInfoRepo;
    public String saveBust(List<EmployeeBusted> employeeBustedList){
        String value="";
        try {


            EmployeeEntity bustEntity =null;
            //crew info
            EmployeeBustInfoEntityPk pk = null;
            EmployeeBustedInfoEntity infoEntity =null;
            List<EmployeeBustedInfoEntity> infoEntityList=null;
            for(EmployeeBusted in: employeeBustedList){
                bustEntity = new EmployeeEntity();
                bustEntity.setRequestId(in.getRequestId());
                employeeBustRepo.save(bustEntity);
                 infoEntityList = new ArrayList<>();
                for(EmployeeBustInfo infoBean : in.getSwapCrewBustInfos()){
                    infoEntity =new EmployeeBustedInfoEntity();
                    pk = new EmployeeBustInfoEntityPk();
                    pk.setBustId(employeeBustRepo.getBustSequenceId());
                    pk.setEmployeeId(infoBean.getEmployeeId());
                    infoEntity.setEmployeeName(infoBean.getEmployeeName());
                    infoEntityList.add(infoEntity);
                }
                employeeBustInfoRepo.saveAll(infoEntityList);

            }
            value="Success!";
        }
        catch (Exception e){
            value="Failed!";
         e.printStackTrace();
        }
        return value;

    }
}

package com.pramodya.hfms.service.custom;

import com.pramodya.hfms.dto.StudentDTO;
import com.pramodya.hfms.service.SuperService;

import java.util.List;

public interface StudentService extends SuperService<StudentDTO,String> {
    List<StudentDTO> getStudentId();
    //String getMaxStuId();
    boolean isStudentExists(String id);
}

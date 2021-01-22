package com.pramodya.hfms.service.custom.impl;

import com.pramodya.hfms.dto.StudentDTO;
import com.pramodya.hfms.entity.Student;
import com.pramodya.hfms.repository.StudentRepository;
import com.pramodya.hfms.service.custom.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<StudentDTO> getStudentId() {
        return null;
    }

    @Override
    public boolean isStudentExists(String id) {
        return false;
    }

    @Override
    public List<StudentDTO> getAll() {
        List<StudentDTO> collect = studentRepository.findAll().stream().map(student -> new StudentDTO(
                student.getStudentid(),
                student.getFirstname(),
                student.getLastname(),
                student.getContactnumber(),
                student.getEmail(),
                student.getCourse(),
                student.getBatch()
        )).collect(Collectors.toList());
        return collect;
    }

    @Override
    public String save(StudentDTO dto) {
        return studentRepository.save(new Student(
                dto.getStudentid(),
                dto.getFirstame(),
                dto.getLastname(),
                dto.getContactnumber(),
                dto.getEmail(),
                dto.getCourse(),
                dto.getBatch())).getStudentid();
    }

    @Override
    public boolean remove(String dtoID) {
        studentRepository.deleteById(dtoID);
        return true;
    }

    @Override
    public boolean update(StudentDTO dto) {
        studentRepository.save(new Student(
                dto.getStudentid(),
                dto.getFirstame(),
                dto.getLastname(),
                dto.getContactnumber(),
                dto.getEmail(),
                dto.getCourse(),
                dto.getBatch()));

        return true;    }

    @Override
    public StudentDTO get(String dtoID) {
        Student student = studentRepository.getOne(dtoID);
        return new StudentDTO(
                student.getStudentid(),
                student.getFirstname(),
                student.getLastname(),
                student.getContactnumber(),
                student.getEmail(),
                student.getCourse(),
                student.getBatch());
    }
}

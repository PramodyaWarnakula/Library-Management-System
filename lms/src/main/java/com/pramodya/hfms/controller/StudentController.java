package com.pramodya.hfms.controller;

import com.pramodya.hfms.dto.StudentDTO;
import com.pramodya.hfms.service.custom.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("api/v1/students")
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<StudentDTO> getAllStudents() {
        return studentService.getAll();
    }

    @GetMapping(value = "{studentid}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StudentDTO> getStudent(@PathVariable("studentid") String id) {
        StudentDTO studentDTO = null;
        if (studentService.isStudentExists(id)) {
            studentDTO = studentService.get(id);
        }
        return new ResponseEntity<StudentDTO>(studentDTO, (studentDTO != null) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> saveStudent(@RequestBody StudentDTO studentDTO) {

        if (!studentService.isStudentExists(studentDTO.getStudentid())){
            String studentID = studentService.save(studentDTO);
            return new ResponseEntity<String>("\"" + studentID +"\"", HttpStatus.CREATED);
        } else {
            throw new RuntimeException("Student Already In The List");
        }
    }

    @DeleteMapping(value = "{studentid}")
    public ResponseEntity<Void> deleteStudent(@PathVariable("studentid") String id) {
        if (!studentService.isStudentExists(id)) {
            return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        } else {
            studentService.remove(id);
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        }
    }
    @PutMapping(value = "{studentid}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updateStudent(@PathVariable("studentid") String id, @RequestBody StudentDTO studentDTO) {
        if (!studentService.isStudentExists(id)) {
            return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }
         else {
            studentService.save(studentDTO);
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        }
    }
}

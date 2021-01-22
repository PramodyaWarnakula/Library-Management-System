package com.pramodya.hfms.controller;


import com.pramodya.hfms.dto.BorrowDTO;
import com.pramodya.hfms.service.custom.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/borrow")
public class BorrowController {

    @Autowired
    private BorrowService borrowService;

    @GetMapping
    public List<BorrowDTO> getAllBooks() {
        return borrowService.getAll();
    }

    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BorrowDTO> getBorrow(@PathVariable("id") int id) {
        BorrowDTO borrowDTO = null;
        if (borrowService.isBorrowExists(id)) {
            borrowDTO = borrowService.get(id);
        }
        return new ResponseEntity<BorrowDTO>(borrowDTO, (borrowDTO != null) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> saveBorrow(@RequestBody BorrowDTO borrowDTO) {

        if (!borrowService.isBorrowExists(borrowDTO.getId())){
            String borrowId = borrowService.save(borrowDTO);
            return new ResponseEntity<String>("\"" + borrowId +" \"", HttpStatus.CREATED);
        } else {
            throw new RuntimeException("Borrow Already In The List");
        }
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        if (!borrowService.isBorrowExists(id)) {
            return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        } else {
            borrowService.remove(id);
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        }
    }
    @PutMapping(value = "{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> update(@PathVariable("id") int id, @RequestBody BorrowDTO borrowDTO) {
        if (!borrowService.isBorrowExists(id)) {
            return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }
        else {
            borrowService.save(borrowDTO);
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        }
    }

}

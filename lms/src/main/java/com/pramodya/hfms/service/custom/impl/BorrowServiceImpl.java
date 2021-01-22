package com.pramodya.hfms.service.custom.impl;


import com.pramodya.hfms.dto.BorrowDTO;
import com.pramodya.hfms.entity.Borrow;
import com.pramodya.hfms.repository.BorrowRepository;
import com.pramodya.hfms.service.custom.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class BorrowServiceImpl implements BorrowService {
    @Autowired
    private BorrowRepository borrowRepository;


    @Override
    public List<BorrowDTO> getAll() {

        List<BorrowDTO> collect = borrowRepository.findAll().stream().map(borrow -> new BorrowDTO(
                borrow.getDateBorrowed(),
                borrow.getId(),
                borrow.getBookid(),
                borrow.getTitle(),
                borrow.getAuthor(),
                borrow.getStudentid(),
                borrow.getStudentname(),
                borrow.getStudentcontact(),
                borrow.getReturndate(),
                borrow.getExtention()
        )).collect(Collectors.toList());
        return collect;

    }

    @Override
    public String save(BorrowDTO dto) {
        return String.valueOf(borrowRepository.save(new Borrow(
                dto.getDateBorrowed(),
                dto.getId(),
                dto.getBookid(),
                dto.getTitle(),
                dto.getAuthor(),
                dto.getStudentid(),
                dto.getStudentname(),
                dto.getStudentcontact(),
                dto.getReturndate(),
                dto.getExtention())).getId());
    }


    @Override
    public boolean remove(Integer dtoID) {
        return false;
    }

    @Override
    public boolean update(BorrowDTO dtoID) {
        return false;
    }

    @Override
    public BorrowDTO get(Integer dtoID) {
        return null;
    }

    @Override
    public List<BorrowDTO> getBorrowId() {
        return null;
    }

    @Override
    public boolean isBorrowExists(Integer id) {
        return false;
    }
}

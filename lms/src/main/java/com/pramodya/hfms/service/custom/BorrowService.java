package com.pramodya.hfms.service.custom;

import com.pramodya.hfms.dto.BookDTO;
import com.pramodya.hfms.dto.BorrowDTO;
import com.pramodya.hfms.entity.Borrow;
import com.pramodya.hfms.service.SuperService;

import java.util.List;

public interface BorrowService extends SuperService<BorrowDTO,Integer> {

    List<BorrowDTO> getBorrowId();


    boolean isBorrowExists(Integer id);

}

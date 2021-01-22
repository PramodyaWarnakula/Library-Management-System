package com.pramodya.hfms.service.custom;

import com.pramodya.hfms.dto.BookDTO;
import com.pramodya.hfms.service.SuperService;

import java.util.List;

public interface BookService extends SuperService<BookDTO, String> {
    List<BookDTO> getBookId();


    boolean isBookExists(String id);
}

package com.pramodya.hfms.service.custom.impl;

import com.pramodya.hfms.dto.BookDTO;
import com.pramodya.hfms.entity.Book;
import com.pramodya.hfms.repository.BookRepository;
import com.pramodya.hfms.service.custom.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
   private BookRepository bookRepository;


    @Override
    public List<BookDTO> getBookId() {
        return null;
    }

    @Override
    public boolean isBookExists(String id) {
        return false;
    }

    @Override
    public List<BookDTO> getAll() {
        List<BookDTO> collect = bookRepository.findAll().stream().map(book -> new BookDTO(
                book.getBookid(),
                book.getTitle(),
                book.getAuthor(),
                book.getPublishyear(),
                book.getCatogery(),
                book.getIsbn(),
                book.getEdition(),
                book.getBooktype(),
                book.getPublication(),
                book.getNotes()
        )).collect(Collectors.toList());
        return collect;
    }

    @Override
    public String save(BookDTO dto) {
        return bookRepository.save(new Book(
                dto.getBookid(),
                dto.getTitle(),
                dto.getAuthor(),
                dto.getPublishyear(),
                dto.getCatogery(),
                dto.getIsbn(),
                dto.getEdition(),
                dto.getBooktype(),
                dto.getPublication(),
                dto.getNotes())).getBookid();
    }

    @Override
    public boolean remove(String dtoID) {
        return false;
    }

    @Override
    public boolean update(BookDTO dtoID) {
        return false;
    }

    @Override
    public BookDTO get(String dtoID) {
        Book book = bookRepository.getOne(dtoID);
        return new BookDTO(
                book.getBookid(),
                book.getTitle(),
                book.getAuthor(),
                book.getPublishyear(),
                book.getCatogery(),
                book.getIsbn(),
                book.getEdition(),
                book.getBooktype(),
                book.getPublication(),
                book.getNotes());
    }
}

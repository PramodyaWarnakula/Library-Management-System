package com.pramodya.hfms.controller;

import com.pramodya.hfms.dto.BookDTO;
import com.pramodya.hfms.service.custom.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("api/v1/book")

public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<BookDTO> getAllBooks() {
        return bookService.getAll();
    }

    @GetMapping(value = "{bookid}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BookDTO> getChamary(@PathVariable("bookid") int id) {
        BookDTO bookDTO = null;
        if (bookService.isBookExists(String.valueOf(id))) {
            bookDTO = bookService.get(String.valueOf(id));
        }
        return new ResponseEntity<BookDTO>(bookDTO, (bookDTO != null) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> saveBook(@RequestBody BookDTO bookDTO) {

        if (!bookService.isBookExists(bookDTO.getBookid())){
            String bookid = bookService.save(bookDTO);
            return new ResponseEntity<String>("\"" + bookid +"\"", HttpStatus.CREATED);
        } else {
            throw new RuntimeException("Book Already In The List");
        }
    }

    @DeleteMapping(value = "{bookid}")
    public ResponseEntity<Void> deleteChamary(@PathVariable("bookid") int id) {
        if (!bookService.isBookExists(String.valueOf(id))) {
            return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        } else {
            bookService.remove(String.valueOf(id));
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        }
    }
    @PutMapping(value = "{bookid}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> update(@PathVariable("bookid") int id, @RequestBody BookDTO bookDTO) {
        if (!bookService.isBookExists(String.valueOf(id))) {
            return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }
        else {
            bookService.save(bookDTO);
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        }
    }

}

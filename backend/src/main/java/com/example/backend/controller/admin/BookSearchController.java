package com.example.backend.controller.admin;

import com.example.backend.pojo.Book;
import com.example.backend.service.admin.BookSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class BookSearchController {
    @Autowired
    private BookSearchService bookSearchService;

    @GetMapping("/admin/booksearch/")
    public Map<String, Object> searchbook(@RequestParam String standard, String content,boolean ifblur){
        return bookSearchService.searchbook(standard,content,ifblur);
    }
}

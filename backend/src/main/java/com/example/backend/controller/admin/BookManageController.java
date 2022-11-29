package com.example.backend.controller.admin;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.backend.pojo.Book;
import com.example.backend.service.admin.BookManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class BookManageController {
    @Autowired
    private BookManageService bookManageService;

    @GetMapping("/api/admin/bookoverview/")
    public IPage getallbooks(long current,long size){
        return bookManageService.getallbooks(current, size);
    }

    @GetMapping("/api/admin/booksearch/")
    public Map<String, Object> searchbook(@RequestParam String standard, String content, boolean ifblur){
        return bookManageService.searchbook(standard,content,ifblur);
    }

    @PostMapping("/api/admin/bookedit/")
    public Map<String,String> editbook(@RequestBody Map<String,String> m){
        return bookManageService.editbook(m);
    }

    @PostMapping("/api/admin/book/")
    public Map<String,String> addbook(@RequestBody Book book)
    {
        return bookManageService.addbook(book);
    }

    @DeleteMapping("/api/admin/book/")
    public Map<String,String> deletebook(String isbn)
    {
        return  bookManageService.deletebook(isbn);
    }
}

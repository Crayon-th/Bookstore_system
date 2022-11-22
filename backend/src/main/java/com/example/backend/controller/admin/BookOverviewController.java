package com.example.backend.controller.admin;

import com.example.backend.pojo.Book;
import com.example.backend.service.admin.BookOverviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookOverviewController {
    @Autowired
    private BookOverviewService bookOverviewService;

    @GetMapping("/admin/bookoverview/")
    public List<Book> getallbooks(){
        return bookOverviewService.getallbooks();
    }

}

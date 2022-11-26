package com.example.backend.service.admin;

import com.example.backend.pojo.Book;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public interface BookManageService {
    List<Book> getallbooks();

    Map<String,Object> searchbook(String standard, String content, boolean ifblur);

    Map<String,String> editbook(Map<String,String> m);
}

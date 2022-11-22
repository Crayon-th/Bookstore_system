package com.example.backend.service.admin;

import com.example.backend.pojo.Book;

import java.util.List;
import java.util.Map;

public interface BookSearchService {
    Map<String,Object> searchbook(String standard, String content,boolean ifblur);
}

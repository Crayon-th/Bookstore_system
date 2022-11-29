package com.example.backend.service.admin;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.backend.pojo.Book;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public interface BookManageService {
    IPage getallbooks(long current,long size);

    Map<String,Object> searchbook(String standard, String content, boolean ifblur);

    Map<String,String> editbook(Map<String,String> m);

    Map<String,String> addbook(Book book);

    Map<String ,String> deletebook(String isbn);
}

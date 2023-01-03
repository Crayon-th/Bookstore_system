package com.example.backend.service.admin;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.backend.pojo.Book;

import java.util.Map;

public interface BookManageService {
    IPage getallbooks(long current,long size);

    IPage searchbook(String content,long current,long size);

    Map<String,String> editbook(Map<String,String> m);

    Map<String,String> addbook(Book book);

    Map<String ,String> deletebook(String isbn);

    int getScore(String isbn);
}

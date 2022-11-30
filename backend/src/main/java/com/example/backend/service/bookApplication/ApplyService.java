package com.example.backend.service.bookApplication;

import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.Map;

public interface ApplyService {
    Map<String,String>applyABook(int uid,String isbn,String bookname);

    IPage getApplication(long current,long size);

    Map<String,String> handleApplication(String isbn);
}

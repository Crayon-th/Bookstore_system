package com.example.backend.service.bookApplication;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.backend.pojo.Book;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

public interface ApplyService {
    Map<String,String>applyABook(int uid, @RequestBody Book book);

    IPage getApplication(long current,long size);

    Map<String,String> handleApplication(Book book);

    void deleteApplication(int id);
}

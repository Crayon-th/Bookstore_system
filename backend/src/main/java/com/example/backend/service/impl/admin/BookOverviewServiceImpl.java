package com.example.backend.service.impl.admin;

import com.example.backend.mapper.BookMapper;
import com.example.backend.pojo.Book;
import com.example.backend.service.admin.BookOverviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookOverviewServiceImpl implements BookOverviewService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> getallbooks() {
        return bookMapper.selectList(null);
    }
}

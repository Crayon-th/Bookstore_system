package com.example.backend.controller.bookApplication;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.backend.pojo.Book;
import com.example.backend.service.bookApplication.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ApplyController {
    @Autowired
    private ApplyService applyService;

    @PostMapping("/apply/")
    public Map<String,String> applyABook(int uid, @RequestBody Book book)
    {
        Map<String,String> m = applyService.applyABook(uid, book);
        return m;
    }

    @GetMapping("/apply/application/")
    public IPage getApplication(long current,long size)
    {
        IPage iPage = applyService.getApplication(current,size);
        return iPage;
    }

    @DeleteMapping("/apply/application/")
    public Map<String,String> handleApplication(@RequestBody Book book)
    {
        Map<String,String> m = new HashMap<>();
        m = applyService.handleApplication(book);
        return m;
    }


}

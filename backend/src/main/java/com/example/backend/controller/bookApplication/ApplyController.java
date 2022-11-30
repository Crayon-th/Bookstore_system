package com.example.backend.controller.bookApplication;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.backend.service.bookApplication.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ApplyController {
    @Autowired
    private ApplyService applyService;

    @PostMapping("/apply/")
    public Map<String,String> applyABook(int uid,String isbn,String bookname)
    {
        Map<String,String> m = applyService.applyABook(uid, isbn, bookname);
        return m;
    }

    @GetMapping("/apply/application/")
    public IPage getApplication(long current,long size)
    {
        IPage iPage = applyService.getApplication(current,size);
        return iPage;
    }

    @DeleteMapping("/apply/application/")
    public Map<String,String> handleApplication(String isbn)
    {
        Map<String,String> m = new HashMap<>();
        m = applyService.handleApplication(isbn);
        return m;
    }


}

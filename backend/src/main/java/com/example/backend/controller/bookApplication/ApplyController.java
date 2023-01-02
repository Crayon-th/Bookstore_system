package com.example.backend.controller.bookApplication;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.backend.pojo.Book;
import com.example.backend.service.bookApplication.ApplyService;
import io.swagger.annotations.ApiOperation;
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

    //需要修改
    @ApiOperation(value = "用于处理申请，让申请的书目被录入的接口")
    @DeleteMapping("/apply/application/handle")
    public Map<String,String> handleApplication(@RequestBody Book book)
    {
        Map<String,String> m = new HashMap<>();
        m = applyService.handleApplication(book);
        return m;
    }

    @ApiOperation(value = "用于删除申请")
    @DeleteMapping("/apply/application/")
    public void deleteApplication(int id)
    {
        applyService.deleteApplication(id);
    }


}

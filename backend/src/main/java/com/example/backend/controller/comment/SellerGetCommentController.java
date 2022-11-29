package com.example.backend.controller.comment;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.backend.pojo.Comment;
import com.example.backend.service.comment.GetCommentByOrderIDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SellerGetCommentController {
    @Autowired
    private GetCommentByOrderIDService getCommentByOrderIDService;
    @GetMapping("/user/sellerGetComment/")
    IPage getComment(int orderID,long current,long size){
        return getCommentByOrderIDService.getComment(orderID,current,size);
    }
}

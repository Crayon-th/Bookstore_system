package com.example.backend.controller.comment;

import com.example.backend.pojo.Comment;
import com.example.backend.service.comment.GetCommentByUserIDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BuyerGetCommentController {
    @Autowired
    private GetCommentByUserIDService getCommentByUserIDService;
    @GetMapping("/user/buyerGetComment/")
    List<Comment> getComment(int userID){
        return getCommentByUserIDService.getComment(userID);
    }
}

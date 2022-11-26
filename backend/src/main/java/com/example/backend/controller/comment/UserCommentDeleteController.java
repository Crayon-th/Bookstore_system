package com.example.backend.controller.comment;

import com.example.backend.service.comment.UserCommentDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCommentDeleteController {
    @Autowired
    private UserCommentDeleteService userCommentDeleteService;
    @PostMapping("/user/deleteComment/")
    public int deleteComment(int ID){
        return userCommentDeleteService.deleteComment(ID);
    }
}

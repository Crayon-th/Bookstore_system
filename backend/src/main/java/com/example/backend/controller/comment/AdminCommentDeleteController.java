package com.example.backend.controller.comment;

import com.example.backend.service.comment.AdminCommentDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminCommentDeleteController {
    @Autowired
    private AdminCommentDeleteService admincommentDeleteService;

    @PostMapping("/admin/deleteComment/")
    public int DeleteComment(int ID){
        return admincommentDeleteService.deleteComment(ID);

    }
}

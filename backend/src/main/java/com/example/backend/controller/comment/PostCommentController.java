package com.example.backend.controller.comment;

import com.example.backend.pojo.Comment;
import com.example.backend.service.comment.PostCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.backend.utils.timeUtil;

@RestController
public class PostCommentController {
    @Autowired
    private PostCommentService postCommentService;
    private timeUtil timeUtil=new timeUtil();

    @PostMapping("/user/postComment/")
    public int PostComment(Comment comment){
        comment.setDate(timeUtil.getCurrentTimeStamp());
        return postCommentService.postComment(comment);
    }
}
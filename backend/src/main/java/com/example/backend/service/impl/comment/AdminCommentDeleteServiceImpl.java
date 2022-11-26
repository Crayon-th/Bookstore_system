package com.example.backend.service.impl.comment;

import com.example.backend.mapper.CommentMapper;
import com.example.backend.service.comment.AdminCommentDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminCommentDeleteServiceImpl implements AdminCommentDeleteService {
    @Autowired
    private CommentMapper commentMapper;
    @Override
    public int deleteComment(int commentID){
        return commentMapper.deleteById(commentID);
    }
}

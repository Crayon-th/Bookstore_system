package com.example.backend.service.impl.comment;

import com.example.backend.mapper.CommentMapper;
import com.example.backend.pojo.Comment;
import com.example.backend.service.comment.PostCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostCommentServiceImpl implements PostCommentService {
    @Autowired
    private CommentMapper commentMapper;

    @Override
    public int postComment(Comment comment) {
        return commentMapper.insert(comment);
    }
}

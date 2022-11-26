package com.example.backend.service.impl.comment;

import com.example.backend.mapper.CommentMapper;
import com.example.backend.service.comment.UserCommentDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCommentDeleteServiceImpl implements UserCommentDeleteService {
    @Autowired
    private CommentMapper commentMapper;

    @Override
    public int deleteComment(int ID) {
        return commentMapper.deleteById(ID);
    }
}

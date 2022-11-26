package com.example.backend.service.impl.comment;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.backend.mapper.CommentMapper;
import com.example.backend.pojo.Comment;
import com.example.backend.service.comment.GetCommentByOrderIDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GetCommentByOrderIDServiceImpl implements GetCommentByOrderIDService {
    @Autowired
    private CommentMapper commentMapper;
    @Override
    public List<Comment> getComment(int orderID) {

        QueryWrapper<Comment> qw = new QueryWrapper<Comment>();
        qw.eq("orderID", orderID);
        List<Comment> comments = commentMapper.selectList(qw);
        return comments;
    }
}

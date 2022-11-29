package com.example.backend.service.impl.comment;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.backend.mapper.CommentMapper;
import com.example.backend.pojo.Comment;
import com.example.backend.service.comment.GetCommentByOrderIDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GetCommentByOrderIDServiceImpl implements GetCommentByOrderIDService {
    @Autowired
    private CommentMapper commentMapper;
    @Override
    public IPage getComment(int orderID,long current,long size) {

        Page<Comment> page = new Page<>(current,size);
        QueryWrapper<Comment> qw = new QueryWrapper<Comment>();
        IPage comments = commentMapper.selectPage(page,qw.eq("orderID", orderID));
        return comments;
    }
}

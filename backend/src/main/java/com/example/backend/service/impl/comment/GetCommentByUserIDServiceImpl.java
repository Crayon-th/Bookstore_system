package com.example.backend.service.impl.comment;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.backend.mapper.CommentMapper;
import com.example.backend.pojo.Comment;
import com.example.backend.service.comment.GetCommentByUserIDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GetCommentByUserIDServiceImpl implements GetCommentByUserIDService {
    @Autowired
    private CommentMapper commentMapper;
    @Override
    public IPage getComment(int userID,long current,long size)
    {
        Page<Comment> page = new Page<>(current,size);
        QueryWrapper<Comment> qw=new QueryWrapper<Comment>();
        IPage<Comment> comments=commentMapper.selectPage(page,qw.eq("replyID",userID));
        return comments;
    }
}

package com.example.backend.service.impl.comment;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.backend.mapper.CommentMapper;
import com.example.backend.pojo.Comment;
import com.example.backend.service.comment.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;

    @Override
    public IPage getCommentByOrder(int orderID, long current, long size) {

        Page<Comment> page = new Page<>(current,size);
        QueryWrapper<Comment> qw = new QueryWrapper<Comment>();
        IPage comments = commentMapper.selectPage(page,qw.eq("orderID", orderID));
        return comments;
    }
    @Override
    public IPage getCommentByUser(int userID,long current,long size)
    {
        Page<Comment> page = new Page<>(current,size);
        QueryWrapper<Comment> qw=new QueryWrapper<Comment>();
        IPage<Comment> comments=commentMapper.selectPage(page,qw.eq("replyID",userID));
        return comments;
    }

    @Override
    public int postComment(Comment comment) {
        return commentMapper.insert(comment);
    }

    @Override
    public int deleteComment(int ID) {
        return commentMapper.deleteById(ID);
    }
}

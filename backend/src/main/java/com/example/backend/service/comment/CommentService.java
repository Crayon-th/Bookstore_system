package com.example.backend.service.comment;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.backend.pojo.Comment;

public interface CommentService {
    IPage getCommentByOrder(int orderID, long current, long size);
    IPage getCommentByUser(int userID,long current,long size);
    int postComment(Comment comment);
    int deleteComment(int commentID);
}

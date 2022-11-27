package com.example.backend.service.comment;

import com.example.backend.pojo.Comment;

import java.util.List;

public interface GetCommentByUserIDService {
    List<Comment> getComment(int userID);
}

package com.example.backend.service.comment;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.backend.pojo.Comment;

import java.util.List;

public interface GetCommentByUserIDService {
    IPage getComment(int userID,long current,long size);
}

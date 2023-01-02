package com.example.backend.controller.comment;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.backend.pojo.Comment;
import com.example.backend.service.comment.CommentService;
import com.example.backend.utils.timeUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "评论接口")
public class CommentController {
    @Autowired
    private CommentService commentService;

    private timeUtil time = new timeUtil();

    @ApiOperation(value = "删除特定的评论")
    @DeleteMapping ("/api/comment/")
    public int DeleteComment(int ID){
        return commentService.deleteComment(ID);
    }

    @GetMapping("/api/comment/user")
    @ApiOperation(value = "通过用户id来获得他所做过的评论")
    public IPage GetCommentByUser(int userid,long current,long size)
    {
        return commentService.getCommentByUser(userid,current,size);
    }

    @GetMapping("/api/comment/order")
    @ApiOperation(value = "通过订单id来获得对应的评论")
    public IPage GetCommentByOrder(int orderid,long current,long size)
    {
        return commentService.getCommentByOrder(orderid,current,size);
    }

    @PostMapping("/api/comment")
    @ApiOperation(value = "发表一个评论")
    public int PostComment(Comment comment){
        comment.setDate(time.getCurrentTimeStamp());
        return commentService.postComment(comment);
    }
}

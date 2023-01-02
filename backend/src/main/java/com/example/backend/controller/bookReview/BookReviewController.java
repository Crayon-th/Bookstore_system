package com.example.backend.controller.bookReview;

import com.example.backend.pojo.BookReview;
import com.example.backend.service.bookReview.BookReviewService;
import com.example.backend.utils.timeUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "书评相关接口")
public class BookReviewController {
    @Autowired
    private BookReviewService bookReviewService;

    private timeUtil time = new timeUtil();

    @DeleteMapping("/api/bookReview")
    @ApiOperation(value = "使用id删除书评")
    public int deleteReview(int id)
    {
        return bookReviewService.deleteReview(id);
    }

    @GetMapping("/api/bookReview")
    @ApiOperation(value = "获得这本书的对应书评")
    public List<BookReview> getReview(String isbn)
    {
        return bookReviewService.getReview(isbn);
    }

    @PostMapping("/api/bookReview")
    @ApiOperation(value = "发表评论")
    public int postReview(@RequestBody BookReview bookReview){
        bookReview.setDate(time.getCurrentTimeStamp());
        return bookReviewService.postReview(bookReview);
    }


}

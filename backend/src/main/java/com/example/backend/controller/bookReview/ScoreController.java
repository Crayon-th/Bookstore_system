package com.example.backend.controller.bookReview;

import com.example.backend.mapper.ScoreMapper;
import com.example.backend.pojo.Score;
import com.example.backend.service.admin.BookManageService;
import com.example.backend.service.bookReview.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoreController {
    @Autowired
    private ScoreService scoreService;
    @Autowired
    private BookManageService bookManageService;
    @PostMapping("/user/score/")
    public int score(Score score){
        int result=scoreService.score(score);
        bookManageService.getScore(score.getIsbn());
        return result;
    }
}

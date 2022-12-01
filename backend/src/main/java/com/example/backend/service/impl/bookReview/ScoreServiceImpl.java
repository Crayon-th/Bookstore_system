package com.example.backend.service.impl.bookReview;

import com.example.backend.mapper.ScoreMapper;
import com.example.backend.pojo.Score;
import com.example.backend.service.bookReview.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreServiceImpl implements ScoreService {
    @Autowired
    private ScoreMapper scoreMapper;
    @Override
    public int score(Score score) {
        return scoreMapper.insert(score);
    }
}

package com.example.backend.service.feedback;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.backend.pojo.Feedback;

import java.util.List;
import java.util.Map;

public interface FeedbackService {
    Feedback getFeedback(int id);
    IPage<Feedback> feedbackDisplay(long current,long size);
    Map<String,String> giveFeedBack(Feedback feedback);
    Map<String,String> handleFeedback(int id);
}

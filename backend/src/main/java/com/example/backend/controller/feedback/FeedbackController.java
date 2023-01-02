package com.example.backend.controller.feedback;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.backend.pojo.Feedback;
import com.example.backend.service.feedback.FeedbackService;
import com.example.backend.utils.timeUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class FeedbackController {
    @Autowired
    private FeedbackService feedbackService;

    private timeUtil time = new timeUtil();
    @GetMapping("/api/feedback")
    @ApiOperation(value = "根据id获取feedback")
    public Feedback getFeedback(int id)
    {
        return feedbackService.getFeedback(id);
    }

    @ApiOperation(value = "管理员获得待处理的反馈")
    @GetMapping("/api/feedback/admin")
    public IPage<Feedback> displayFeedback(long current,long size)
    {
        return feedbackService.feedbackDisplay(current,size);
    }

    @PostMapping("/api/feedback")
    @ApiOperation(value = "给出一个反馈，用body来传feedback，详见swagger")
    public Map<String,String> giveFeedback(@RequestBody Feedback feedback)
    {
        feedback.setHandle(false);
        feedback.setCreatetime(time.getCurrentTimeStamp());
        Map<String,String> m = feedbackService.giveFeedBack(feedback);
        return m;
    }

    @PostMapping("/api/feedback/handle")
    @ApiOperation(value = "管理员处理反馈")
    public Map<String,String> handleFeedback(int id)
    {
        Map<String,String> m = new HashMap<>();
        m = feedbackService.handleFeedback(id);
        return m;
    }


}

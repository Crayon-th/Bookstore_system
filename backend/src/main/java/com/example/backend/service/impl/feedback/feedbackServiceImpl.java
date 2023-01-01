package com.example.backend.service.impl.feedback;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.backend.mapper.FeedbackMapper;
import com.example.backend.pojo.Feedback;
import com.example.backend.service.feedback.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class feedbackServiceImpl implements FeedbackService{
    @Autowired
    private FeedbackMapper feedbackMapper;

    @Override
    public Feedback getFeedback(int id)
    {
        return feedbackMapper.selectById(id);
    }
    @Override
    public IPage<Feedback> feedbackDisplay(long current,long size)
    {
        Page p = new Page(current,size);
        IPage<Feedback> page = new Page<>();
        QueryWrapper<Feedback> q = new QueryWrapper<>();
        page = feedbackMapper.selectPage(p,q.eq("handle",false));
        return page;
    }
    @Override
    public Map<String,String> giveFeedBack(Feedback feedback)
    {
        Map<String,String> m = new HashMap<>();
        try
        {
            feedbackMapper.insert(feedback);
            m.put("message","成功");
        }
        catch (Exception e)
        {
            m.put("message", e.getMessage());
        }
        return m;
    }
    @Override
    public Map<String,String> handleFeedback(int id)
    {
        Feedback feedback = feedbackMapper.selectById(id);
        Map<String,String> m = new HashMap<>();
        feedback.setHandle(true);
        try
        {
            feedbackMapper.updateById(feedback);
            m.put("message","成功处理反馈");
        }
        catch (Exception e)
        {
            m.put("message",e.getMessage());
        }
        return m;
    }
}

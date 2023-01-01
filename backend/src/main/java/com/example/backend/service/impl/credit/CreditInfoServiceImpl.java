package com.example.backend.service.impl.credit;

import cn.hutool.db.sql.Order;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.backend.mapper.*;
import com.example.backend.pojo.Comment;
import com.example.backend.pojo.Complaint;
import com.example.backend.pojo.Orders;
import com.example.backend.pojo.Score;
import com.example.backend.service.credit.CreditInfoService;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class CreditInfoServiceImpl implements CreditInfoService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private CommentMapper commentMapper;
    @Autowired
    private ComplaintMapper complaintMapper;

    @Override
    public Map<String,Double> getCreditScore(int userid) {
        Double score = -1.1;
        Map<String,Double> m = new HashMap<>();
        QueryWrapper<Orders> queryWrapper = new QueryWrapper<>();
        List<Orders> orders = orderMapper.selectList(queryWrapper.eq("sellerid",userid));
        List<Comment> comments = new ArrayList<>();
        for (int i = 0;i<orders.size();i++)
        {
            if(i == 0)
                score = 0d;
            Orders order = orders.get(i);
            Comment comment= commentMapper.selectOne(new QueryWrapper<Comment>().eq("orderID",order.getId()));
            comments.add(comment);
            score += comment.getScore();
        }
        score = score / comments.size();
        m.put("Score",score);
        m.put("dishonestTime",(double)userMapper.selectById(userid).getDishonestTime());
        return m;
    }


}

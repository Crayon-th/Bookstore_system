package com.example.backend.service.impl.complaint;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.backend.mapper.ComplaintMapper;
import com.example.backend.mapper.OrderMapper;
import com.example.backend.mapper.UserMapper;
import com.example.backend.pojo.Commodity;
import com.example.backend.pojo.Complaint;
import com.example.backend.pojo.Orders;
import com.example.backend.pojo.User;
import com.example.backend.service.complaint.complaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class complaintServiceImpl implements complaintService {
    @Autowired
    private ComplaintMapper complaintMapper;
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public IPage<Complaint> getComplaints(long current, long size) {
        Page p = new Page<>(current,size);
        QueryWrapper<Complaint> q = new QueryWrapper();
        IPage<Complaint> page = complaintMapper.selectPage(p,q.eq("isFinished",0));
        return page;
    }

    @Override
    public Map<String,String> makeComplaint(Complaint complaint)
    {
        Map<String,String> m = new HashMap<>();
        try
        {
            complaintMapper.insert(complaint);
            m.put("message","投诉成功，我们会根据您提供的信息进行裁决，若经查实，卖家将会被警告");
        }
        catch (Exception e)
        {
            m.put("message",e.getMessage());
        }
        return m;
    }

    @Override
    public Map<String, String> deleteComplaint(int id)
    {
        Map<String,String> m = new HashMap<>();
        try
        {
            complaintMapper.deleteById(id);
            m.put("message","投诉撤销成功");
        }
        catch (Exception e)
        {
            m.put("message",e.getMessage());
        }
        return m;
    }

    @Override
    public Complaint getComplaint(int id) {
        return complaintMapper.selectById(id);
    }

    @Override
    public void handleComplaint(int id) {
        Complaint complaint = complaintMapper.selectById(id);
        complaint.setIsFinished(true);
        complaintMapper.updateById(complaint);
    }

    @Override
    public void punishUser(int complaintid) {
        Complaint complaint = complaintMapper.selectById(complaintid);
        Orders order = orderMapper.selectById(complaint.getOrderID());
        User user = userMapper.selectById(order.getSellerid());
        user.setDishonestTime(user.getDishonestTime()+1); //让违反诚信记录的次数加1
    }
}

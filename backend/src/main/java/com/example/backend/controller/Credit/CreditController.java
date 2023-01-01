package com.example.backend.controller.Credit;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.backend.mapper.ComplaintMapper;
import com.example.backend.pojo.Complaint;
import com.example.backend.service.auth.UserService;
import com.example.backend.service.complaint.complaintService;
import com.example.backend.service.credit.CreditInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api(tags = "信用评级相关,因为投诉涉及到信用评级所以也加在这个controller里",value = "CreditController")
public class CreditController {
    @Autowired
    private CreditInfoService creditInfoService;
    @Autowired
    private complaintService complaintService;


    @ApiOperation(value = "获得待解决的投诉")
    @GetMapping("/api/complaints")
    public IPage<Complaint> getComplaints(long current,long size)
    {
        return complaintService.getComplaints(current,size);
    }

    @ApiOperation(value = "获取特定用户评分信息")
    @GetMapping("/api/credit/score")
    public Map<String,Double> getCreditScore(int userid)
    {
        return creditInfoService.getCreditScore(userid);
    }

    @ApiOperation(value = "进行商品投诉")
    @PostMapping("/api/complaint")
    public Map<String,String> makeComplaint(Complaint complaint)
    {
        Map<String,String> m = complaintService.makeComplaint(complaint);
        return m;
    }

    @ApiOperation(value = "删除投诉，用于撤回投诉")
    @DeleteMapping("/api/complaint")
    public Map<String,String> deleteComplaint(int id)
    {
        Map<String,String> m = complaintService.deleteComplaint(id);
        return m;
    }

    @ApiOperation(value = "获取一个特定投诉的详细信息")
    @GetMapping("/api/complaint")
    public Complaint getComplaint(int id)
    {
        return complaintService.getComplaint(id);
    }

    @ApiOperation(value = "解决一个投诉,参数里的type是1代表管理员认为卖家违规，type是0代表管理员认为卖家不违规")
    @PostMapping("/api/complaint/finish")
    public Map<String,String> handleComplaint(int id,int type)
    {
        Map<String,String> m = new HashMap<>();
        //首先将这个complaint标记为handled
        complaintService.handleComplaint(id);

        if(type == 1)
        {
            complaintService.punishUser(id);
            m.put("message","已经对卖家进行了惩罚");
        }
        else
        {
            m.put("message","投诉处理完成，认为卖家无错");
        }
        return m;
    }

}

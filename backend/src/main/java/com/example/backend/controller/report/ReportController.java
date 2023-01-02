package com.example.backend.controller.report;

import com.example.backend.pojo.BookReview;
import com.example.backend.pojo.ViolationReport;
import com.example.backend.service.report.ReportService;
import com.example.backend.utils.picUtil;
import com.example.backend.utils.timeUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@RestController
public class ReportController {
    @Autowired
    private ReportService reportService;
    private timeUtil timeUtil=new timeUtil();
    @PostMapping("/api/report")
    @ApiOperation(value = "对一个评论进行举报")
    public int Report(int reportID,int violationType, String violationDescription,int bookreviewid)
    {
        String date=timeUtil.getCurrentTimeStamp();
        ViolationReport violationReport=new ViolationReport(null,reportID,violationType,violationDescription,date,bookreviewid);
        return reportService.Report(violationReport);
    }

    @GetMapping("/api/report")
    @ApiOperation(value = "为管理员获得所有待处理的reports")
    public List<ViolationReport> getReports()
    {
        return reportService.getReports();
    }

    @DeleteMapping("/api/report")
    @ApiOperation(value = "用于删除report的接口，管理员可以用它来处理解决了的report,返回1时删除成功，-1时出现了异常")
    public int deleteReport(int id)
    {
        return reportService.deleteReport(id);
    }

}

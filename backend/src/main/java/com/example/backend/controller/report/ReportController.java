package com.example.backend.controller.report;

import com.example.backend.pojo.ViolationReport;
import com.example.backend.service.report.ReportService;
import com.example.backend.utils.picUtil;
import com.example.backend.utils.timeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
public class ReportController {
    @Autowired
    private ReportService reportService;
    private timeUtil timeUtil=new timeUtil();
    @PostMapping("/user/report/")
    public int Report(int reportID, int reportedID,int violationType, String violationDescription, MultipartFile evidence, HttpServletRequest request) throws IOException {
        picUtil picUtil=new picUtil();
        String evidencePath=picUtil.savePicture(evidence,"report",request);
        String date=timeUtil.getCurrentTimeStamp();
        ViolationReport violationReport=new ViolationReport(null,reportID,violationType,violationDescription,evidencePath,date,reportedID);
        System.out.println(evidencePath);
        return reportService.Report(violationReport);
    }
}

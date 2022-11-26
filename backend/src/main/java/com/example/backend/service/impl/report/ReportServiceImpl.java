package com.example.backend.service.impl.report;

import com.example.backend.mapper.ViolationReportMapper;
import com.example.backend.pojo.ViolationReport;
import com.example.backend.service.report.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportServiceImpl implements ReportService{
    @Autowired
    private ViolationReportMapper violationReportMapper;

    @Override
    public int Report(ViolationReport violationReport) {
        return violationReportMapper.insert(violationReport);
    }
}

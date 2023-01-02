package com.example.backend.service.impl.report;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.backend.mapper.ViolationReportMapper;
import com.example.backend.pojo.ViolationReport;
import com.example.backend.service.report.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportServiceImpl implements ReportService{
    @Autowired
    private ViolationReportMapper violationReportMapper;

    @Override
    public int Report(ViolationReport violationReport) {
        return violationReportMapper.insert(violationReport);
    }

    @Override
    public List<ViolationReport> getReports()
    {
        List<ViolationReport> reports = violationReportMapper.selectList(null);
        return reports;
    }

    @Override
    public int deleteReport(int id)
    {
        try{
            violationReportMapper.deleteById(id);
            return 1;
        }
        catch (Exception e)
        {
            return -1;
        }
    }
}

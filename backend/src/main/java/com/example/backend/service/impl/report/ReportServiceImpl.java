package com.example.backend.service.impl.report;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
    public IPage getReports(long current, long size)
    {
        Page page = new Page(current,size);
        IPage<ViolationReport> iPage = violationReportMapper.selectPage(page,null);
        return iPage;
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

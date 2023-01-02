package com.example.backend.service.report;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.backend.pojo.ViolationReport;

import java.util.List;

public interface ReportService {
    int Report(ViolationReport report);

    IPage getReports(long current,long size);

    int deleteReport(int id);
}

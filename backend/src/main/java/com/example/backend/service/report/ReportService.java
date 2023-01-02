package com.example.backend.service.report;

import com.example.backend.pojo.ViolationReport;

import java.util.List;

public interface ReportService {
    int Report(ViolationReport report);

    List<ViolationReport> getReports();

    int deleteReport(int id);
}

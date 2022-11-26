package com.example.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.backend.pojo.ViolationReport;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ViolationReportMapper extends BaseMapper<ViolationReport> {
}

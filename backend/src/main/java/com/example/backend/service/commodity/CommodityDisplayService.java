package com.example.backend.service.commodity;

import com.example.backend.mapper.CommodityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface CommodityDisplayService {

    Map<String,String> ShowCommodities();
}

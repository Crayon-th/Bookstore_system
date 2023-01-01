package com.example.backend.service.credit;

import com.example.backend.pojo.Comment;
import com.example.backend.pojo.Complaint;
import io.swagger.models.auth.In;

import java.util.Map;

public interface CreditInfoService {
    Map<String , Double> getCreditScore(int userid);

}

package com.example.backend.service.complaint;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.backend.pojo.Complaint;

import java.util.Map;

public interface complaintService {
    IPage<Complaint> getComplaints(long current,long size);

    Map<String,String> makeComplaint(Complaint complaint);

    Map<String,String> deleteComplaint(int id);

    Complaint getComplaint(int id);

    void handleComplaint(int id);

    void punishUser(int complaintid);
}

package com.example.backend.controller.admin;

import com.example.backend.service.admin.AdminReviewDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminReviewDeleteController {
    @Autowired
    private  AdminReviewDeleteService adminReviewDeleteService;
    @PostMapping("/admin/deleteReview/")
    public int deleteReview(int ID){
        return adminReviewDeleteService.deleteReview(ID);
    }
}

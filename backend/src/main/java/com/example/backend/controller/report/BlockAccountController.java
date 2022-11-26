package com.example.backend.controller.report;

import com.example.backend.service.report.BlockAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlockAccountController {
    @Autowired
    private BlockAccountService blockAccountService;
    @PostMapping("/admin/blockAccount/")
    public int blockAccount(int userID){
        return blockAccountService.blockAccount(userID);
    }
}

package com.example.backend.service.email;

import com.example.backend.utils.dto.EmailDto;

public interface EmailService {
    void send(EmailDto emailDto);
}

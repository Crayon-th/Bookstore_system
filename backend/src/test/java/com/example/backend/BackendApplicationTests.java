package com.example.backend;

import com.example.backend.utils.rsa.RsaUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class BackendApplicationTests {

    @Autowired
    JavaMailSenderImpl mailSender;
    @Value("${rsa.private-key}")
    private String privateKey;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Test
    void contextLoads() throws Exception {
        String pw="1111";
        String sss=passwordEncoder.encode(pw);
        System.out.println(sss);


    }

}

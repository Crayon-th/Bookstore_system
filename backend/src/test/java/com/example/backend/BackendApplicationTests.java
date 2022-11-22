package com.example.backend;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BackendApplicationTests {

    @Test
    void contextLoads() {
        String salt=new SecureRandomNumberGenerator().nextBytes().toString();
        String encoded = new SimpleHash("md5", "pdd", salt, 2).toString();
        System.out.println(salt);
        System.out.println(encoded);
    }

}

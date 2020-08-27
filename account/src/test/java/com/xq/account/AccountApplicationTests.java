package com.xq.account;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

@SpringBootTest
class AccountApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testFile() throws Exception {
        File file = new File("D:\\IDEA\\projects\\xq2580z\\account-parent\\account\\src\\main\\resources\\effective-java-study.png");
        byte[] bytes = new byte[1000];
        byte[] buffer = null;
        FileInputStream fis = new FileInputStream(file);
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        int n;
        while ((n = fis.read(bytes)) != -1) {
            b.write(bytes, 0, n);
        }
        fis.close();
        b.close();
        buffer = b.toByteArray();
        System.out.println(buffer);
    }
}

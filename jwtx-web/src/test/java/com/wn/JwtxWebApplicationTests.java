package com.wn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试
@SpringBootTest(classes = com.wn.JwtxWebApplication.class,webEnvironment= SpringBootTest.WebEnvironment.NONE)
//@ActiveProfiles({ProfileConstants.DEV,ProfileConstants.JUNIT})
@Transactional
//@Rollback(value = true)
 public class JwtxWebApplicationTests {

    @Test
    void contextLoads() {
    }

}

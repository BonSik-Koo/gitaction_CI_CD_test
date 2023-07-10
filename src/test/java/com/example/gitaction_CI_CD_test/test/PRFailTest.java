package com.example.gitaction_CI_CD_test.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
public class PRFailTest {

    @Autowired TestService testService;

    @Test
    public void failTest(){
        final Long no = 100L;
        testService.findTest(no);
    }
}

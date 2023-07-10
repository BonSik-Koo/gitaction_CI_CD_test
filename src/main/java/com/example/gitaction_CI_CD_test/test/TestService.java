package com.example.gitaction_CI_CD_test.test;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class TestService {

    private final TestRepository testRepository;

    public Test findTest(Long no){
        return testRepository.findById(no)
                .orElseThrow(() -> new NullPointerException("찾을 수 없습니다."));
    }
}

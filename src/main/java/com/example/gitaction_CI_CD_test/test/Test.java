package com.example.gitaction_CI_CD_test.test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Test {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    private String name;
}

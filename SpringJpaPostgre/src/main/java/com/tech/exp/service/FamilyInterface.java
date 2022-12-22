package com.tech.exp.service;

import com.tech.exp.entity.Babies;
import org.springframework.web.bind.annotation.ResponseBody;

public interface FamilyInterface {

    void addBaby(int age, String name);

    Babies getBabies();
}

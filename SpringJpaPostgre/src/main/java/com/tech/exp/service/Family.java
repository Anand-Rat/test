package com.tech.exp.service;

import com.tech.exp.entity.Babies;
import com.tech.exp.entity.Baby;
import com.tech.exp.repo.BabyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class Family implements  FamilyInterface{

    @Autowired
    private BabyRepository babyRepository;
    @Override
    public void addBaby(int age, String name) {
        Baby baby = new Baby();
        baby.setAge(age);
        baby.setName(name);
        babyRepository.save(baby);

    }

    @Override
    public Babies getBabies() {
        Babies babies = new Babies();
        babies.setBabies(babyRepository.findAll());
        return babies;
    }
}

package com.fatigue.service;

import com.fatigue.dao.UserRepository;
import com.fatigue.model.DTO.DataDTO;
import com.fatigue.model.Information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class InsertService {

    private UserRepository userRepository;

    @Autowired
    public InsertService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean getInsert(DataDTO dataDTO) {
        Information information = new Information();
        information.setUserName(dataDTO.getUserName());
        information.setUserGender(dataDTO.getUserGender());
        information.setUserAge(dataDTO.getUserAge());
        information.setUserOccupation(dataDTO.getUserOccupation());
        information.setUserEducation(dataDTO.getUserEducation());
        information.setMathTime(dataDTO.getMathTime());
        information.setVValue(dataDTO.getVValue());
        information.setRightNumber(dataDTO.getRightNumber());
        information.setWrongNumber(dataDTO.getWrongNumber());
        information.setDivValue(dataDTO.getDivValue());
        information.setCreateTime(LocalDateTime.now());
        return information.insert();
    }
}

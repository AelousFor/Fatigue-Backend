package com.fatigue.service;

import com.fatigue.dao.UserRepository;
import com.fatigue.model.Information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllDataService {

    private UserRepository userRepository;

    @Autowired
    public GetAllDataService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Information> getData() {
        return userRepository.list();
    }
}

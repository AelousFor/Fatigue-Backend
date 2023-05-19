package com.fatigue.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fatigue.dao.UserRepository;
import com.fatigue.model.Information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteDataService {

    private UserRepository userRepository;

    @Autowired
    public DeleteDataService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void deleteData(Integer key) {
        QueryWrapper<Information> wrapper = new QueryWrapper<>();
        wrapper.eq("auto_key", key);
        int count = userRepository.count(wrapper);
        if (count == 1) {
            userRepository.remove(wrapper);
        }
    }
}

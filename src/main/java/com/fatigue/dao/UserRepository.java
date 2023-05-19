package com.fatigue.dao;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fatigue.model.Information;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends ServiceImpl<UserMapper, Information> {
}

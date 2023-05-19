package com.fatigue.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fatigue.model.Information;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<Information> {
}

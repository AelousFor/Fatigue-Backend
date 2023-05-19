package com.fatigue.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("infor")
public class Information extends Model<Information> {

    @TableId(type = IdType.AUTO)
    private Integer autoKey;

    private String userName;

    private String userGender;

    private Integer userAge;

    private String userOccupation;

    private String userEducation;

    private Float mathTime;

    private String fatigueDegree;

    private String vValue;

    private String rightNumber;

    private String wrongNumber;

    private String divValue;

    private LocalDateTime createTime;

    @TableLogic
    private Integer deleted;

}

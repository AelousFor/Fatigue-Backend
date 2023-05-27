package com.fatigue.service;

import com.alibaba.excel.EasyExcel;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class ReadFileService {

    public List<Collection<Integer>> readExcelByRowNum() {
//        String fileName = "D:\\桌面\\data.csv";
        String fileName = "/www/wwwroot/fa/data.csv";
        CustomDataListener listener = new CustomDataListener();
        // 读取第rowNum行数据
        EasyExcel.read(fileName, listener).sheet().doRead();
        return listener.getList();
    }

}

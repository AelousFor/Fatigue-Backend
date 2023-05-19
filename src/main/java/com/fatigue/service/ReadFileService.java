package com.fatigue.service;

import com.alibaba.excel.EasyExcel;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ReadFileService {

    public Collection<Integer> readExcelByRowNum(int rowNum) {
        String fileName = "D:\\桌面\\data.csv";
        CustomDataListener listener = new CustomDataListener();
        // 读取第rowNum行数据
        EasyExcel.read(fileName, listener).sheet().doRead();
        return listener.getList(rowNum);
    }

}

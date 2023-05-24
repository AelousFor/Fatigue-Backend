package com.fatigue.service;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class CustomDataListener extends AnalysisEventListener<Map<Integer, Integer>> {

    private final List<Collection<Integer>> list = new ArrayList<>(); // 存储读取的数据

    @Override
    public void invoke(Map<Integer, Integer> data, AnalysisContext analysisContext) {
        list.add(data.values());
    }

    // 全部行都读取完成后会调用该方法
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
    }

    public List<Collection<Integer>> getList() {
        return list;
    }
}
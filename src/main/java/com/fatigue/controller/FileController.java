package com.fatigue.controller;

import com.fatigue.model.base.RespBody;
import com.fatigue.service.ReadFileService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RequestMapping("/file")
@RestController
@Api(value = "文件controller", tags = {"文件接口"})
public class FileController {

    private ReadFileService readFileService;

    @Autowired
    public FileController(ReadFileService readFileService) {
        this.readFileService = readFileService;
    }

    @GetMapping("/get")
    public RespBody<Collection<Integer>> getFile(@RequestParam Integer row) {
        return RespBody.ok(readFileService.readExcelByRowNum(row));
    }
}

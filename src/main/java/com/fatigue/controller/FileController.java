package com.fatigue.controller;

import com.fatigue.model.base.RespBody;
import com.fatigue.service.ReadFileService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RequestMapping("/file")
@RestController
@Api(value = "文件controller", tags = {"文件接口"})
public class FileController {

    private ReadFileService readFileService;

    @Autowired
    public FileController(ReadFileService readFileService) {
        this.readFileService = readFileService;
    }

    @GetMapping("/getWave")
    public RespBody<List<Collection<Integer>>> getWave() {
        return RespBody.ok(readFileService.readWave());
    }

    @GetMapping("/getFatigue")
    public RespBody<List<Collection<Integer>>> getFatigue() {
        return RespBody.ok(readFileService.readFatigue());
    }
}

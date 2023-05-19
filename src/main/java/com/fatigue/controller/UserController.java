package com.fatigue.controller;

import com.fatigue.model.DTO.DataDTO;
import com.fatigue.model.Information;
import com.fatigue.model.base.RespBody;
import com.fatigue.service.DeleteDataService;
import com.fatigue.service.GetAllDataService;
import com.fatigue.service.InsertService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")
@RestController
@Api(value = "用户controller", tags = {"用户操作接口"})
public class UserController {

    private InsertService insertService;
    private GetAllDataService getAllDataService;
    private DeleteDataService deleteDataService;

    @Autowired
    public UserController(InsertService insertService, GetAllDataService getAllDataService, DeleteDataService deleteDataService) {
        this.insertService = insertService;
        this.getAllDataService = getAllDataService;
        this.deleteDataService = deleteDataService;
    }

    @PostMapping("/insert")
    public RespBody<Void> insertData(@RequestBody DataDTO dataDTO) {
        if (insertService.getInsert(dataDTO)) {
            return RespBody.ok();
        }
        return RespBody.fail("");
    }

    @GetMapping("/get")
    public RespBody<List<Information>> getData() {
        return RespBody.ok(getAllDataService.getData());
    }

    @DeleteMapping("/delete")
    public RespBody<Void> deleteData(@RequestParam Integer autoKey) {
        deleteDataService.deleteData(autoKey);
        return RespBody.ok();
    }
}

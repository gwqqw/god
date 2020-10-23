package com.future.god.controller;

import com.future.god.entity.Dev;
import com.future.god.service.DevService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Dev)表控制层
 *
 * @author makejava
 * @since 2020-10-23 14:35:05
 */
@RestController
@RequestMapping("dev")
public class DevController {
    /**
     * 服务对象
     */
    @Resource
    private DevService devService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Dev selectOne(Long id) {
        return this.devService.queryById(id);
    }

    @PostMapping("addOne")
    public Dev addOne(@RequestBody Dev dev){
        return this.devService.insert(dev);
    }

}
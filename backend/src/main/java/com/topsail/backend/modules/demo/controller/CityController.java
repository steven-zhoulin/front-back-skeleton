package com.topsail.backend.modules.demo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.topsail.backend.modules.demo.entity.dto.CityDTO;
import com.topsail.backend.modules.demo.entity.po.City;
import com.topsail.backend.modules.demo.service.ICityService;
import io.swagger.models.auth.In;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Steven
 * @since 2019-12-19
 */
@RestController
@Slf4j
@RequestMapping("/api/demo/city")
public class CityController {

    @Autowired
    private ICityService cityService;

    @GetMapping("list/{current}/{size}")
    public IPage<CityDTO> list(@PathVariable("current") int current, @PathVariable("size") int size) {
        return cityService.list(current, size);
    }

    @PostMapping("add")
    public void add(@RequestBody City city) {
        log.info("city: {}", city);
        cityService.save(city);
    }

    @GetMapping("getOne/{id}")
    public City getOne(@PathVariable("id") Integer id) {
        return cityService.getById(id);
    }

    @PostMapping("edit")
    public void edit(@RequestBody City city) {
        log.info("{}", city);
        cityService.updateById(city);
    }

    @GetMapping("delete/{id}")
    public void delete(@PathVariable("id")Integer id) {
        cityService.removeById(id);
    }

}

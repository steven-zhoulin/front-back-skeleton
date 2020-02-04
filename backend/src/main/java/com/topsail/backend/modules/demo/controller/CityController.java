package com.topsail.backend.modules.demo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.topsail.backend.modules.demo.entity.dto.CityDTO;
import com.topsail.backend.modules.demo.service.ICityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}

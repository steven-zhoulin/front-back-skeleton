package com.topsail.backend.modules.demo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.topsail.backend.modules.demo.entity.po.City;
import com.topsail.backend.modules.demo.service.ICityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
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
    public IPage<City> list(@PathVariable("current") int current, @PathVariable("size") int size) {
        log.info("current=" + current + ", size=" + size);
        IPage<City> page = new Page(current, size);
        IPage<City> cityIPage = cityService.page(page);

        return cityIPage;
    }

}

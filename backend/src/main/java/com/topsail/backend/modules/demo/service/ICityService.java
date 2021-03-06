package com.topsail.backend.modules.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.topsail.backend.modules.demo.entity.dto.CityDTO;
import com.topsail.backend.modules.demo.entity.po.City;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Steven
 * @since 2019-12-19
 */
public interface ICityService extends IService<City> {
    IPage<CityDTO> list(int current, int size);
}

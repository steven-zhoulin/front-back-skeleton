package com.topsail.backend.modules.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.topsail.backend.modules.demo.entity.dto.CityDTO;
import com.topsail.backend.modules.demo.entity.po.City;
import com.topsail.backend.modules.demo.mapper.CityMapper;
import com.topsail.backend.modules.demo.service.ICityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Steven
 * @since 2019-12-19
 */
@Slf4j
@Service
public class CityServiceImpl extends ServiceImpl<CityMapper, City> implements ICityService {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public IPage<CityDTO> list(int current, int size) {
        IPage<City> page = new Page(current, size);
        IPage<CityDTO> cityDTOIPage = cityMapper.listCity(page);
        return cityDTOIPage;
    }
}

package com.topsail.backend.modules.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.topsail.backend.modules.demo.entity.po.Province;
import com.topsail.backend.modules.demo.mapper.CityMapper;
import com.topsail.backend.modules.demo.mapper.ProvinceMapper;
import com.topsail.backend.modules.demo.service.IProvinceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Steven
 * @since 2019-12-19
 */
@Slf4j
@Service
public class ProvinceServiceImpl extends ServiceImpl<ProvinceMapper, Province> implements IProvinceService {

    @Autowired
    private ProvinceMapper provinceMapper;

}

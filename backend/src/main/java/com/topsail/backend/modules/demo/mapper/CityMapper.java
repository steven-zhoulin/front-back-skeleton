package com.topsail.backend.modules.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.topsail.backend.modules.demo.entity.po.City;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Steven
 * @since 2019-12-19
 */
@Mapper
public interface CityMapper extends BaseMapper<City> {

}

package com.topsail.backend.modules.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.topsail.backend.modules.demo.entity.dto.CityDTO;
import com.topsail.backend.modules.demo.entity.po.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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

    @Select("select c.id, c.name, c.city_id, c.province_id, p.name provinceName from city c, province p where c.province_id = p.province_id")
    public IPage<CityDTO> listCity(IPage<City> page);

}

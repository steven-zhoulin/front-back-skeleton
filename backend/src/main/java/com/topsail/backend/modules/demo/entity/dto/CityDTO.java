package com.topsail.backend.modules.demo.entity.dto;

import lombok.Data;

/**
 * @author Steven
 * @date 2020-02-04
 */
@Data
public class CityDTO {

    private Long id;
    private String name;
    private String cityId;
    private String provinceId;
    private String provinceName;

}

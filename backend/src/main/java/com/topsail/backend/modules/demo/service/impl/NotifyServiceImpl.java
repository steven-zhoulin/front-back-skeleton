package com.topsail.backend.modules.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.topsail.backend.modules.demo.entity.po.Notify;
import com.topsail.backend.modules.demo.mapper.NotifyMapper;
import com.topsail.backend.modules.demo.service.INotifyService;
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
public class NotifyServiceImpl extends ServiceImpl<NotifyMapper, Notify> implements INotifyService {

    @Autowired
    private NotifyMapper notifyMapper;

}

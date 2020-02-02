package com.topsail.backend.modules.demo.controller;

import com.topsail.backend.modules.demo.entity.po.Notify;
import com.topsail.backend.modules.demo.service.INotifyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/api/demo/notify")
public class NotifyController {

    @Autowired
    private INotifyService notifyServiceImpl;

    @GetMapping("list")
    public List<Notify> list() {
        return notifyServiceImpl.list();
    }

}

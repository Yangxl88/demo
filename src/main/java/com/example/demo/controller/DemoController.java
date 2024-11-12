package com.example.demo.controller;

import com.example.demo.utils.DemoUtil;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @作者:YangXL
 * @日期：2024/11/12 10:06
 * @版本：V1.0
 * @描述：
 */
@RestController
@RequestMapping("/demo")
@Validated
public class DemoController {

    @GetMapping("/create")
    public List<String> createMapPlatformPatent() {
        return DemoUtil.buildScopes("sdfwe dfsfd");
    }
}

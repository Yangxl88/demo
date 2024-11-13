package com.example.demo.controller;

import com.example.demo.utils.DemoUtil;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/create")
    public List<String> createMapPlatformPatent(@RequestParam(value = "scope", required = false) String scope) {
        List<String> scopes = DemoUtil.buildScopes(scope);
        return DemoUtil.buildScopes(scope);
    }
    @PostMapping("/create2")
    public List<String> createMapPlatformPatent2(@RequestParam(value = "scope", required = false) String scope) {
        List<String> scopes = DemoUtil.buildScopes(scope);
        return DemoUtil.buildScopes(scope);
    }
    @PostMapping("/create3")
    public List<String> createMapPlatformPatent3(@RequestParam(value = "scope", required = false) String scope) {
        List<String> scopes = DemoUtil.buildScopes(scope);
        return DemoUtil.buildScopes(scope);
    }
    @PostMapping("/create4")
    public List<String> createMapPlatformPatent4(@RequestParam(value = "scope", required = false) String scope) {
        List<String> scopes = DemoUtil.buildScopes(scope);
        return DemoUtil.buildScopes(scope);
    }

    @PostMapping("/create5")
    public List<String> createMapPlatformPatent5(@RequestParam(value = "scope", required = false) String scope) {
        List<String> scopes = DemoUtil.buildScopes(scope);
        return DemoUtil.buildScopes(scope);
    }
}

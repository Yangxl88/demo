package com.example.demo.utils;

import cn.hutool.core.util.StrUtil;
import org.springframework.validation.annotation.Validated;

import java.util.List;

/**
 * @作者:YangXL
 * @日期：2024/11/12 8:57
 * @版本：V1.0
 * @描述：
 */
public class DemoUtil {
    public static List<String> buildScopes(@Validated String scope) {
        return StrUtil.split(scope, ' ');
    }
}

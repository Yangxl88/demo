package com.example.demo.utils;

import cn.hutool.core.util.StrUtil;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public static String checkPnIsPublication(String pn) {
        Pattern pattern = Pattern.compile("\\d+([a-zA-Z]+)+(\\d*)$");
        Matcher matcher = pattern.matcher(pn);
        if (matcher.find()) {
            return matcher.group(1).toUpperCase();
        }
        return "";
    }
    public static String dealApplyNumber(String applyNumber) {
        Pattern pattern = Pattern.compile("\\d+([a-zA-Z]+)+(\\d*)$");
        Matcher matcher = pattern.matcher(applyNumber);
        if (matcher.find()) {
            return applyNumber.substring(0, matcher.start(1));
        } else {
            return applyNumber;
        }
    }
}

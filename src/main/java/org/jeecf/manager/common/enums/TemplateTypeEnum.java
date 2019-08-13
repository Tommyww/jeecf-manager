package org.jeecf.manager.common.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jeecf.common.mapper.JsonMapper;

/**
 * 模版类型枚举
 * 
 * @author jianyiming
 *
 */
public enum TemplateTypeEnum {
    /**
     * 基本类型
     */
    BASE(1, "基本类型"),
    /**
     * 表类型
     */
    TABLE(2, "表类型"),
    /**
     * 数字字典
     */
    DICT(3, "数字字典"),
    /**
     * 表字典
     */
    TABLE_DICT(4, "表字典"),;

    private final int code;
    private final String name;

    public int getCode() {
        return code;
    }

    public String getName() {

        return name;
    }

    private TemplateTypeEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public static Integer getCode(String name) {
        for (TemplateTypeEnum e : TemplateTypeEnum.values()) {
            if (e.getName().equals(name)) {
                return e.getCode();
            }
        }
        return null;
    }

    public static String getName(int code) {
        for (TemplateTypeEnum e : TemplateTypeEnum.values()) {
            if (e.getCode() == code) {
                return e.getName();
            }
        }
        return null;
    }

    public static String toJsonString() {
        List<Map<String, Object>> dataMap = new ArrayList<>();
        for (TemplateTypeEnum e : TemplateTypeEnum.values()) {
            Map<String, Object> map = new HashMap<String, Object>(10);
            map.put("code", e.getCode());
            map.put("name", e.getName());
            dataMap.add(map);
        }
        return JsonMapper.toJson(dataMap);
    }

}

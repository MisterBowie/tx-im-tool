package com.vv.im.common.bean;

/**
 * <prev>
 * 请求类和实体类都要实现的方法
 * <prev>
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @date 2022/5/11
 */
public interface ToJson {
    /**
     * 转换为json字符串
     *
     * @return json字符串
     */
    String toJson();
}

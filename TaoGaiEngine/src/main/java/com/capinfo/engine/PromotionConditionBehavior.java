package com.capinfo.engine;

/**
 * 晋升条件判断器
 * @param <T>
 */
public interface PromotionConditionBehavior<T> {
    /**
     * 当前版本号
     * @return
     */
    VersionInfo getVersion();
    /**
     * 晋升判断
     * @param t 原始数据
     * @return
     */
    Promotion process(T t);

    /**
     * 验证是否正确 如果不符合晋升条件
     * @param data
     * @return
     */
    public MessageCode validate(T data);


}

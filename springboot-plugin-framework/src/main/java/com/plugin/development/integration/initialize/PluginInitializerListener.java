package com.plugin.development.integration.initialize;

import org.pf4j.Plugin;

/**
 * 插件初始化监听者
 *
 * @author zhangzhuo
 * @version 1.0
 */
public interface PluginInitializerListener {

    /**
     * 初始化之前
     */
    void before();


    /**
     * 初始化完成
     */
    void complete();

    /**
     * 初始化失败
     * @param throwable 异常
     */
    void failure(Throwable throwable);

}
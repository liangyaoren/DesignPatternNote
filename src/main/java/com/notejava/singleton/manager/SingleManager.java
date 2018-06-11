package com.notejava.singleton.manager;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器式
 * 单例容器，将多种单例装进一个静态 map 里面，统一管理。
 * @author lyle 2018/6/11 10:19.
 */
public class SingleManager {
    private static Map<String, Object> instanceMap = new HashMap<String, Object>();

    private SingleManager() {}

    public static void register(String key, Object instance) {
        if (!instanceMap.containsKey(key)) {
            instanceMap.put(key, instance);
        }
    }

    public static Object get(String key) {
        return instanceMap.get(key);
    }
}

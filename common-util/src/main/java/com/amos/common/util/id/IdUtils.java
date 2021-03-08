package com.amos.common.util.id;

import java.util.UUID;

/**
 * IdUtils
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/5/31
 */
public class IdUtils {

    public static String uuid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

}

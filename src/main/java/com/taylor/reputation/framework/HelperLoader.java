package com.taylor.reputation.framework;


import com.taylor.reputation.framework.helper.AopHelper;
import com.taylor.reputation.framework.helper.BeanHelper;
import com.taylor.reputation.framework.helper.ClassHelper;
import com.taylor.reputation.framework.helper.ControllerHelper;
import com.taylor.reputation.framework.helper.IocHelper;
import com.taylor.reputation.framework.util.ClassUtil;

/**
 * 加载相应的 Helper 类
 *
 * @author huangyong
 * @since 1.0.0
 */
public final class HelperLoader {

    public static void init() {
        Class<?>[] classList = {
            ClassHelper.class,
            BeanHelper.class,
            AopHelper.class,
            IocHelper.class,
            ControllerHelper.class
        };
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName());
        }
    }
}
package com.taylor.reputation.framework;

/**
 * 提供相关配置项常量
 *
 * @author huangyong
 * @since 1.0.0
 */
public interface ConfigConstant {

    String CONFIG_FILE = "reputation.properties";

    String JDBC_DRIVER = "reputation.framework.jdbc.driver";
    String JDBC_URL = "reputation.framework.jdbc.url";
    String JDBC_USERNAME = "reputation.framework.jdbc.username";
    String JDBC_PASSWORD = "reputation.framework.jdbc.password";

    String APP_BASE_PACKAGE = "reputation.framework.app.base_package";
    String APP_JSP_PATH = "reputation.framework.app.jsp_path";
    String APP_ASSET_PATH = "reputation.framework.app.asset_path";
    String APP_UPLOAD_LIMIT = "reputation.framework.app.upload_limit";
}

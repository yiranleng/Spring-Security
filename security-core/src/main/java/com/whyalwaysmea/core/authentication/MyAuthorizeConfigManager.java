package com.whyalwaysmea.core.authentication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.stereotype.Component;

/**
 * @Author: HanLong
 * @Date: Create in 2018/3/31 15:06
 * @Description:    搜集所有的AuthorizeConfigProvider
 */
@Component
public class MyAuthorizeConfigManager{

    @Autowired
    private List<AuthorizeConfigProvider> authorizeConfigProviders;

    public void config(ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry config) {
        for (AuthorizeConfigProvider authorizeConfigProvider : authorizeConfigProviders) {
            authorizeConfigProvider.config(config);
        }
    }
}

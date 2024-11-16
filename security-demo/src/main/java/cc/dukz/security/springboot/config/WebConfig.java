/* Copyright (c) 2024, TD SYNNEX Corporation. All rights reserved */

package cc.dukz.security.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * web config
 * same as springmvc.xml
 *
 * @author Arvin Du
 * @version 1.0
 * @date 2024/11/11
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("redirect:/login");
        // WebMvcConfigurer.super.addViewControllers(registry);
    }

}

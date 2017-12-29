package com.jm.jmtravelApp.config;

import com.jm.jmtravelApp.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

/**
 * AuditorConfig
 *
 * @author Eric
 * @date 2017/12/27
 */
@Configuration
public class AuditorConfig implements AuditorAware<String> {
    @Override
    public String getCurrentAuditor() {
        //Subject subject = SecurityUtils.getSubject();
        //Object object = subject.getPrincipal();
        return "admin";
    }
}

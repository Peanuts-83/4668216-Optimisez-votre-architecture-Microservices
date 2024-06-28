package com.mproduits.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("my-config")
@RefreshScope
public class ApplicationPropertiesConfiguration {
    private int limitDeProduit;
    public void setLimitDeProduit(int limitDeProduit) {
        this.limitDeProduit = limitDeProduit;
    }
    public int getLimitDeProduit() {
        return limitDeProduit;
    }
}

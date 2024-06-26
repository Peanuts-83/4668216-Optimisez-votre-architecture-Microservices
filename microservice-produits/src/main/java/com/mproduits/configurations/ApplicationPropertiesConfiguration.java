package com.mproduits.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("product-config")
public class ApplicationPropertiesConfiguration {
    public int getLimitDeProduit() {
        return limitDeProduit;
    }

    public void setLimitdeProduit(int limitDeProduit) {
        this.limitDeProduit = limitDeProduit;
    }

    private int limitDeProduit;

}

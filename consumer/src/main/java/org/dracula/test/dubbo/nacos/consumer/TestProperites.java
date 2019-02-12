package org.dracula.test.dubbo.nacos.consumer;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author dk
 */
@ConfigurationProperties("a")
public class TestProperites {

    private String b;

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}

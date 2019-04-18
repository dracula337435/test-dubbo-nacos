package org.dracula.test.dubbo.nacos.consumer;

import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author dk
 */
@ConfigurationProperties
@NacosConfigurationProperties(dataId = "test-prop", autoRefreshed = true)
public class TestAutoRefreshedProperties {

    private String a;

    private String b;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}

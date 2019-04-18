package org.dracula.test.dubbo.nacos.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.dracula.test.dubbo.nacos.TestInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dk
 */
@RestController
public class TestController {

    private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Reference
    private TestInterface testInterface;

    @GetMapping("/sayHello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "world") String name){
        String sayHello = testInterface.sayHello(name);
        logger.info("in controller, "+sayHello);
        return sayHello;
    }


    @NacosValue(value = "${useLocalCache:false}", autoRefreshed = true)
    private boolean useLocalCache;

    @GetMapping("/testNacosConfigautoRefreshed")
    public boolean get() {
        return useLocalCache;
    }

    @Value("${useLocalCache}")
    private String another;

    @GetMapping("/testNacosConfigNonautoRefreshed")
    public String getAnother() {
        return another;
    }

    @Autowired
    private TestProperites testProperites;

    @GetMapping("/getB")
    public String getB(){
        return testProperites.getB();
    }

    @NacosValue(value="${d.e}")
    private String e;

    @GetMapping("/getE")
    public String getE(){
        return e;
    }

    @Autowired
    private TestAutoRefreshedProperties testAutoRefreshedProperties;

    @GetMapping("/a")
    public String getA(){
        return testAutoRefreshedProperties.getA();
    }

}

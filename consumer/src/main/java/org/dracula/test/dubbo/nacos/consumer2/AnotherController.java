package org.dracula.test.dubbo.nacos.consumer2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dk
 */
@RestController
public class AnotherController {

    private String fromXml;

    @RequestMapping("/getFromXml")
    public String anotherTest(){
        return fromXml;
    }

    public String getFromXml() {
        return fromXml;
    }

    public void setFromXml(String fromXml) {
        this.fromXml = fromXml;
    }

}

package org.dracula.test.dubbo.nacos.provider;

import com.alibaba.dubbo.config.annotation.Service;
import org.dracula.test.dubbo.nacos.TestInterface;

/**
 * @author dk
 */
@Service
public class TestInterfaceImpl implements TestInterface {

    @Override
    public String sayHello(String name) {
        return "hello "+name;
    }

}

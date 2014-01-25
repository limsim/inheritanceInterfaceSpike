package org.theSpike;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class TheUser implements ApplicationContextAware{

    ApplicationContext applicationContext = null;

    @Test
    public void myTest() {
        theInterface something = (theInterface) applicationContext.getBean("theClass");
        something.method1();
        something.method2();
    }

    @Test
    public void dummy() {
        theInterface something = (theInterface) applicationContext.getBean("OtherClass");
        something.method1();
        something.method2();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}

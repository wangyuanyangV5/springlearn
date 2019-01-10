package com.mybatis.copy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorTest implements BeanPostProcessor {

	private static Logger log = LoggerFactory.getLogger(BeanPostProcessorTest.class);

    @Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		log.error("Bean [" + beanName + "] 开始初始化");
        // 这里一定要返回 bean，不能返回 null
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		log.error("Bean [" + beanName + "] 完成初始化");
        return bean;
    }

    public void display(){
        System.out.println("hello BeanPostProcessor!!!");
    }
}
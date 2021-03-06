package com.mybatis.copy;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;
import service.UserService;

/**
 * postProcessBeanFactory() 工作与 BeanDefinition 加载完成之后，Bean 实例化之前，其主要作用是对加载 BeanDefinition 进行修改
 */
public class BeanFactoryPostProcessor_1 implements BeanFactoryPostProcessor,Ordered {
	@Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("调用 BeanFactoryPostProcessor_1 ...");

        System.out.println("容器中有 BeanDefinition 的个数：" + beanFactory.getBeanDefinitionCount());

//        // 获取指定的 BeanDefinition
//        BeanDefinition bd = beanFactory.getBeanDefinition("userService");
//
//        MutablePropertyValues pvs = bd.getPropertyValues();
//
//        pvs.addPropertyValue("name","chenssy1");
//        pvs.addPropertyValue("age",15);
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
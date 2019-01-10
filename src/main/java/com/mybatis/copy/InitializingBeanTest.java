package com.mybatis.copy;

import org.springframework.beans.factory.InitializingBean;

public class InitializingBeanTest implements InitializingBean {

    private String name ="chenssy 1号";

    @Override
	public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBeanTest initializing...");

        this.name = "chenssy 2 号";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
package com.edu.spring;

import org.springframework.beans.factory.FactoryBean;

/**
 * 运行时Bean工厂 -> 创建bean
 * @author jiangwt02
 *
 */
public class RunnableFactoryBean implements FactoryBean<Jeep> {

	public Jeep getObject() throws Exception {
		return new Jeep();
	}

	public Class<?> getObjectType() {
		return Jeep.class;
	}

	public boolean isSingleton() {
		return true;
	}

}

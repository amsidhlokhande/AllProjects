/**
 * 
 */
package com.amsidh.bean.factory.post.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

/**
 * @author VIRU
 *
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.config.BeanFactoryPostProcessor#postProcessBeanFactory(org.springframework.beans.factory.config.ConfigurableListableBeanFactory)
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory context)
			throws BeansException {
		PropertyPlaceholderConfigurer config=new PropertyPlaceholderConfigurer();
		config.setLocation(new ClassPathResource("pointdetails.properties"));
		config.postProcessBeanFactory(context);
		

	}

}

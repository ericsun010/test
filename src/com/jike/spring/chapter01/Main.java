package com.jike.spring.chapter01;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r = new FileSystemResource("helloMessage.xml");
		BeanFactory f = new XmlBeanFactory(r);
		//Resource res = new ClassPathResource("helloMessage.xml");
		//DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		//XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		//reader.loadBeanDefinitions(res);
		
		Person person = (Person)f.getBean("person");
		String s = person.sayHellow();
		System.out.println("The person is curently say " + s);		
	}

}

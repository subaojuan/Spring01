package com.baojuan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baojuan.pojo.People;

public class Test {
	public static void main(String[] args) {
		// Spring创建对象，放入容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 从容器中取得对象
		People people = ac.getBean("p", People.class);
		System.out.println(people);
		/*
		 * 无参构造创建:默认情况. 1.2 有参构造创建:需要明确配置 需要在类中提供有参构造方法 在 applicationContext.xml
		 * 中设置调用哪个构造方法创建 对象 如果设定的条件匹配多个构造方法执行最后的构 造方法 index : 参数的索引,从 0 开始 name: 参数名
		 * type:类型(区分开关键字和封装类 int 和 Integer)
		 */
		/*
		 * People p = new People(); 
		 * String[] names = ac.getBeanDefinitionNames(); 
		 * for(String string : names) { 
		 * System.out.println(string);
		 * }
		 */
	}
}

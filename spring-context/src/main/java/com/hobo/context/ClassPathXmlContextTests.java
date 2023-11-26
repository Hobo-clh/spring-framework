package com.hobo.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <B>主类名称：</B>ClassPathXmlContextTests<BR>
 * <B>概要说明：</B><BR>
 *
 * @author hobo
 * @since 2023/11/25  20:05
 */
public class ClassPathXmlContextTests {

	public static void main(String[] args) {
		// create and configure beans
		ApplicationContext context = new ClassPathXmlApplicationContext("aspects.xml", "daos.xml", "services.xml");
	}
}

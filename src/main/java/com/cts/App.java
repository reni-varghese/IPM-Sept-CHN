package com.cts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.config.AppConfig;
import com.cts.model.NewTriangle;
import com.cts.model.Student;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        AbstractApplicationContext context=
//        		new ClassPathXmlApplicationContext("spring.xml");
//        context.registerShutdownHook();
    	
    	ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
        
//       
//        Circle c=(Circle) context.getBean("cir");
//    	  Circle c1=(Circle) ctx.getBean("cir");
//    	  
//        c1.draw();
    	
//    	NewCircle c=ctx.getBean(NewCircle.class);
//    	c.draw();
    	NewTriangle newC=ctx.getBean("newTri", NewTriangle.class);
    	
    	newC.draw();
    	
    	ApplicationContext context=
    			new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	
    	
    	Student std=(Student) ctx.getBean("student");
    	System.out.println(std.getCourse().getName());
    	
        		
    }
}

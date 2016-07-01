/**
 * 
 */
package cn.zto.consumer;

import java.io.IOException;

/**   
 *  
 * 
 * @Description:   
 * @Author:       XiongLiangSheng  
 * @CreateDate:   2014年9月30日 下午4:56:06   
 * @Version:      v1.0
 *    
 * Date    	CR/DEFECT   Modified By    Description of change
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zto.service.RobinService;



public class ConsumerThd{

    public void sayHello(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationConsumer.xml" });
        
        context.start();

        RobinService demoService = (RobinService) context.getBean("demoService");

        System.out.println(demoService.hello("world"));
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
/**
 * 
 */
package cn.zto.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**   
 *  
 * 
 * @Description:   
 * @Author:       XiongLiangSheng  
 * @CreateDate:   2014年9月30日 下午4:56:57   
 * @Version:      v1.0
 *    
 * Date    	CR/DEFECT   Modified By    Description of change
 */

import cn.zto.service.RobinService;

public class AppTest {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationConsumer.xml" });
        RobinService demoService = (RobinService) context.getBean("demoService");
        System.out.println(demoService.hello("world"));
    }
}
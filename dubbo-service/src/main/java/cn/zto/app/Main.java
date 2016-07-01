/**
 * 
 */
package cn.zto.app;

/**   
 *  
 * 
 * @Description:   
 * @Author:       XiongLiangSheng  
 * @CreateDate:   2014年9月30日 下午4:50:42   
 * @Version:      v1.0
 *    
 * Date    	CR/DEFECT   Modified By    Description of change
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationProvider.xml" });
        
        context.start();
        System.out.println("按任意键退出");
        System.in.read();

    }

}
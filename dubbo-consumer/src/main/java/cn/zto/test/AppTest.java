/**
 * 
 */
package cn.zto.test;

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
import cn.zto.consumer.ConsumerThd;

public class AppTest {
    public static void main(String[] args){
        ConsumerThd thd = new ConsumerThd();
        thd.sayHello();
    }
}
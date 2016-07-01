/**
 * 
 */
package cn.zto.service.impl;

import cn.zto.service.RobinService;
 

/**   
 *  
 * 
 * @Description:   
 * @Author:       XiongLiangSheng  
 * @CreateDate:   2014年9月30日 下午4:49:36   
 * @Version:      v1.0
 *    
 * Date    	CR/DEFECT   Modified By    Description of change
 */
 

public class RobinServiceImpl implements RobinService {

    public String hello(String name) {
        System.out.println(name);
        return "hello : " + name;
    }

}
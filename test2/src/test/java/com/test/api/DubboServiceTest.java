package com.test.api;
import java.util.HashMap;
import java.util.Map;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.alibaba.fastjson.JSON;
import com.test.DubboApi;
public class DubboServiceTest {
	public static void main(String[] args) throws Exception {
		//初始化Spring容器
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring-config.xml" });
		//获取要实用的Bean接口实例
		DubboApi dubboApi = (DubboApi) context.getBean("testApiDubbo");
		new DubboServiceTest().sayHello(dubboApi);
	}
	public void sayHello(DubboApi dubboApi) throws Exception {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("paraA", "paraA");
		//参数和返回都实用通用的Map来实现，Dubbo是支持的
		Map<String, Object> resultMap = dubboApi.sayHello(param);
		System.out.println(JSON.toJSONString(resultMap, true));
	}
}
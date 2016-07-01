package com.test;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;

public class DubboService implements DubboApi{

	@Override
	public Map<String, Object> sayHello(Map<String, Object> para) {
		System.out.println(JSON.toJSONString(para, false));
		Map<String, Object> re = new HashMap<String, Object>();
		re.put("reA", "reA");
		re.put("reB", "reB");
		return re;
	}

}
